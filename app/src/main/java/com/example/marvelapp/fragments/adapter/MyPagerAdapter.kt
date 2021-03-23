package com.example.marvelapp.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val listaFragments = ArrayList<Fragment>()
    private val listaTitulos = ArrayList<String>()

    override fun getCount(): Int {
        return listaTitulos.size
    }

    override fun getItem(position: Int): Fragment {
        return listaFragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence {
        return listaTitulos[position]
    }

    fun addFragment(fragment: Fragment, titulo: String) {
        listaFragments.add(fragment)
        listaTitulos.add(titulo)
    }
}