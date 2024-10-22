package com.amartyasingh.introvibe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform