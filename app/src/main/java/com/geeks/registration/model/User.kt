package com.geeks.registration.model

import java.io.Serializable

data class User(
    var name: String = "",
    var email: String = "",
    var password: Int
): Serializable
