package com.petproj.mvvmcoroutines.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.petproj.mvvmcoroutines.R
import com.petproj.mvvmcoroutines.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUsersList()
    }

    private fun initUsersList() {
        viewModel.initUsersList(this)
    }
}