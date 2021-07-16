package com.petproj.mvvmcoroutines.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.petproj.mvvmcoroutines.utils.JsonReader
import com.petproj.mvvmcoroutines.utils.SharedPrefs

class MainActivityViewModel : ViewModel() {
    fun initUsersList(context: Context) {
        val data = JsonReader.readFile(context)
        SharedPrefs.initPrefs(context)
        SharedPrefs.saveUsers(data)
    }
}