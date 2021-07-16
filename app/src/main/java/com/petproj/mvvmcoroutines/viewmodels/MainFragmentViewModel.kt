package com.petproj.mvvmcoroutines.viewmodels

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.petproj.mvvmcoroutines.entity.User
import com.petproj.mvvmcoroutines.utils.SharedPrefs

class MainFragmentViewModel : ViewModel() {
    fun getUser(): MutableList<User> {
        val list: MutableList<User>
        val users = SharedPrefs.getAllUsers()
        val gson = Gson()
        list = gson.fromJson(users, object : TypeToken<MutableList<User?>?>() {}.type)
        return list
    }
}