package com.airlift.android.modules.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import com.airlift.android.R
import com.airlift.android.databinding.FragmentHomeBinding
import com.airlift.android.modules.base.BaseFragment
import com.airlift.android.modules.home.adapter.HomeViewPagerAdapter
import com.airlift.android.modules.home.viewmodel.HomeViewModel
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun getViewModelClass() = HomeViewModel::class.java

    override fun getViewBinding() = FragmentHomeBinding.inflate(layoutInflater)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        requireActivity().setActionBar(binding.toolbar)
        requireActivity().actionBar?.title = getString(R.string.app_name)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.curated_picks)
                }
                1 -> {
                    tab.text = getString(R.string.my_collections)
                }
            }
        }.attach()

        requireActivity().onBackPressedDispatcher.addCallback {
            requireActivity().finishAndRemoveTask()
        }
    }

    override fun observeData() {

    }

    private fun setupViewPager() {
        val viewPagerAdapter = HomeViewPagerAdapter(
            fragment = this,
            mPageNumbers = 2
        )
        binding.viewPager.adapter = viewPagerAdapter
        binding.viewPager.offscreenPageLimit = 1
    }
}