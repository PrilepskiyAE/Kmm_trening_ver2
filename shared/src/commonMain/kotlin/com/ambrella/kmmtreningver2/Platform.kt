package com.ambrella.kmmtreningver2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform