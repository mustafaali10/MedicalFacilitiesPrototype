package com.example.medicalfacilitiescopy.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.medicalfacilitiescopy.ViewModel.First
import com.example.medicalfacilitiescopy.ViewModel.Second

class FragmentAdapter(fragmentManager:FragmentManager,
                    lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {


    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position==0)
            First()
        else
            Second()
    }


}