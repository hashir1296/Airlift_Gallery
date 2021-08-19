package com.airlift.android.modules.myCollection.view

import android.R
import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import androidx.lifecycle.lifecycleScope
import com.alexvasilkov.gestures.Settings
import com.alexvasilkov.gestures.views.GestureImageView
import com.airlift.android.databinding.FragmentMyCollectionBinding
import com.airlift.android.modules.base.BaseFragment
import com.airlift.android.modules.myCollection.MyCollectionAdapter
import com.airlift.android.modules.myCollection.viewmodel.MyCollectionListViewModel
import com.airlift.android.util.loadImageUsingUrl
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class MyCollectionFragment :
    BaseFragment<FragmentMyCollectionBinding, MyCollectionListViewModel>() {

    private lateinit var adapter: MyCollectionAdapter

    override fun getViewModelClass() = MyCollectionListViewModel::class.java

    override fun getViewBinding() = FragmentMyCollectionBinding.inflate(layoutInflater)
    private lateinit var dialog: Dialog
    private lateinit var zoomedImageView: GestureImageView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
        setupClickListeners()
        observeData()
    }

    override fun setUpViews() {
        dialog = Dialog(requireContext(), android.R.style.Theme_Light)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(com.airlift.android.R.layout.custom_image_dialog)
        zoomedImageView =
            dialog.findViewById<GestureImageView>(com.airlift.android.R.id.customImageView)

        adapter = MyCollectionAdapter(context = requireContext()).apply {
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
            deleteClick = {
                viewLifecycleOwner.lifecycleScope.launch {
                    viewModel.deletePhotoFromCollection(photo = it)
                    withContext(Dispatchers.Main) {
                        Snackbar.make(requireActivity().findViewById(R.id.content),
                            getString(com.airlift.android.R.string.deleted),
                            Snackbar.LENGTH_SHORT).show()
                    }
                }
            }
        }
        binding.rvMyCollection.adapter = adapter
    }

    override fun setupClickListeners() {

    }


    override fun observeData() {
        viewModel.photos.observe(viewLifecycleOwner, { photos ->
            photos?.let {
                adapter.submitList(photos)
                if (photos.isNotEmpty()) {
                    binding.rvMyCollection.visibility = View.VISIBLE
                    binding.tvEmptyView.visibility = View.GONE
                } else {
                    binding.rvMyCollection.visibility = View.GONE
                    binding.tvEmptyView.visibility = View.VISIBLE
                }
            }
        })
    }
}
