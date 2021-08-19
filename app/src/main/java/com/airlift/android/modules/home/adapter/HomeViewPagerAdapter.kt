package com.airlift.android.modules.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.airlift.android.modules.myCollection.view.MyCollectionFragment
import com.airlift.android.modules.curatedList.view.CuratedPhotosListFragment

class HomeViewPagerAdapter(
    var fragment: Fragment,
    val mPageNumbers: Int,
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = mPageNumbers

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                CuratedPhotosListFragment()
            }
            1 -> {
                MyCollectionFragment()
            }
            else -> {
                CuratedPhotosListFragment()
            }
        }
    }
}