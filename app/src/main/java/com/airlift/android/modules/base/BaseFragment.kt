package com.airlift.android.modules.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding, VM : ViewModel> : Fragment() {
    open var useSharedViewModel = false

    protected lateinit var viewModel: VM
    protected lateinit var binding: Binding

    protected abstract fun getViewModelClass(): Class<VM>
    protected abstract fun getViewBinding(): Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
        setupClickListeners()
        observeData()
    }

    open fun setUpViews() {}

    open fun observeView() {}

    open fun setupClickListeners() {}

    open fun observeData() {}

    private fun init() {
        binding = getViewBinding()
        viewModel =
            when (useSharedViewModel) {
                true -> {
                    ViewModelProvider(requireActivity()).get(
                        getViewModelClass()
                    )
                }
                false -> {
                    ViewModelProvider(this).get(getViewModelClass())
                }
            }
    }

}