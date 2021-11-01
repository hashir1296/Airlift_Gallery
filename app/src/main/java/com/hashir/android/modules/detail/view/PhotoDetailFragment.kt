package com.hashir.android.modules.detail.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.hashir.android.databinding.FragmentPhotoDetailBinding
import com.hashir.android.modules.detail.viewmodel.PhotoDetailViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PhotoDetailFragment : Fragment() {

    private val args: PhotoDetailFragmentArgs by navArgs()

    private lateinit var binding: FragmentPhotoDetailBinding

    @Inject
    lateinit var assistedFactory: PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory

    private val viewModel: PhotoDetailViewModel by viewModels {
        PhotoDetailViewModel.Factory(assistedFactory = assistedFactory, id = args.id)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentPhotoDetailBinding.inflate(inflater)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}

