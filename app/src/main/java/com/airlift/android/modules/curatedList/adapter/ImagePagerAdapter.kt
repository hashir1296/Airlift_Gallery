package com.airlift.android.modules.curatedList.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class ImagePagerAdapter(
    var fragment: Fragment,
) :
    FragmentStateAdapter(fragment) {


    var imagesList = ArrayList<String>()

    override fun getItemCount(): Int {
        return imagesList.size
    }

    override fun createFragment(position: Int): Fragment {
       /* val fragment = ImageFragment()

        fragment.arguments = Bundle().apply {
            putString("imageURL", imagesList[position])
        }*/

        return fragment
    }
}
