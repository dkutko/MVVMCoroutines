package com.petproj.mvvmcoroutines.controller

import com.airbnb.epoxy.TypedEpoxyController
import com.petproj.mvvmcoroutines.entity.User
import com.petproj.mvvmcoroutines.model.user

class UserEpoxyController : TypedEpoxyController<MutableList<User>>() {
    override fun buildModels(data: MutableList<User>) {
        data.forEach {
            user {
                name(it.name)
                id(it._id)
                url("https://icon-library.com/images/no-user-image-icon/no-user-image-icon-14.jpg")
            }
        }
    }
}