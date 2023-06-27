package com.example.questmultipf

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform