package com.hashir.android.modules.curatedList.view

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState.*
import androidx.recyclerview.widget.GridLayoutManager
import com.hashir.android.R
import com.hashir.android.databinding.FragmentCuratedPhotosListBinding
import com.hashir.android.modules.base.BaseFragment
import com.hashir.android.modules.curatedList.adapter.CuratedListAdapter
import com.hashir.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel
import com.hashir.android.util.loadImageUsingUrl
import com.alexvasilkov.gestures.Settings
import com.alexvasilkov.gestures.views.GestureImageView
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class CuratedPhotosListFragment :
    BaseFragment<FragmentCuratedPhotosListBinding, CuratedPhotosListViewModel>() {

    private lateinit var adapter: CuratedListAdapter

    private lateinit var layoutManager: GridLayoutManager

    private lateinit var dialog: Dialog
    private lateinit var zoomedImageView: GestureImageView

    override fun getViewModelClass() = CuratedPhotosListViewModel::class.java

    override fun getViewBinding() = FragmentCuratedPhotosListBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
        setupClickListeners()
        observeData()

    }


    override fun setUpViews() {
        layoutManager = GridLayoutManager(requireContext(), 1)
        dialog = Dialog(requireContext(), android.R.style.Theme_Light)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.custom_image_dialog)
        zoomedImageView = dialog.findViewById<GestureImageView>(R.id.customImageView)

        adapter = CuratedListAdapter(layoutManager = layoutManager).apply {
            saveClick = {
                viewLifecycleOwner.lifecycleScope.launch {
                    viewModel.savePhotoOffline(photo = it)
                    withContext(Dispatchers.Main) {
                        Snackbar.make(requireActivity().findViewById(android.R.id.content),
                            getString(R.string.saved),
                            Snackbar.LENGTH_SHORT).show()
                    }
                }
            }
            itemClick = {

                zoomedImageView.loadImageUsingUrl(it.original)

                zoomedImageView.controller.settings
                    .setMaxZoom(2f)
                    .setDoubleTapZoom(-1f) // Falls back to max zoom level
                    .setPanEnabled(true)
                    .setZoomEnabled(true)
                    .setDoubleTapEnabled(true)
                    .setRotationEnabled(false)
                    .setRestrictRotation(false)
                    .setOverscrollDistance(0f, 0f)
                    .setOverzoomFactor(2f)
                    .setFillViewport(true)
                    .setFitMethod(Settings.Fit.INSIDE).gravity = Gravity.CENTER

                dialog.show()

            }
        }
        binding.rvCuratedPhotos.layoutManager = layoutManager
        binding.rvCuratedPhotos.adapter = adapter
    }

    override fun setupClickListeners() {

    }

    override fun onDestroy() {
        adapter.removeLoadStateListener { }
        super.onDestroy()
    }

    override fun observeData() {
        adapter.addLoadStateListener { loadState ->
            binding.progressbar.isVisible = loadState.refresh is Loading
            binding.rvCuratedPhotos.isVisible = loadState.refresh is NotLoading
            binding.tvEmptyView.isVisible = loadState.refresh is Error
        }

        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            viewModel.apiData.collectLatest {
                adapter.submitData(it)
                binding.rvCuratedPhotos.scrollToPosition(0)
            }
        }
    }


}