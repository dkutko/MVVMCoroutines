package com.petproj.mvvmcoroutines.entity

data class User(
    val _id: String?,
    val about: String?,
    val birth: Birth?,
    val death: Death?,
    val gender: String?,
    val name: String?,
    val picture: String?
)