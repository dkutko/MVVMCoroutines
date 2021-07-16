package com.petproj.mvvmcoroutines.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.petproj.mvvmcoroutines.R
import com.petproj.mvvmcoroutines.controller.UserEpoxyController
import com.petproj.mvvmcoroutines.model.user
import com.petproj.mvvmcoroutines.viewmodels.MainFragmentViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private val viewModel: MainFragmentViewModel by viewModels()
    private val epoxyController = UserEpoxyController()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val users = viewModel.getUser()
        epoxyController.setData(users)
        rvUsers.setController(epoxyController)
    }
}