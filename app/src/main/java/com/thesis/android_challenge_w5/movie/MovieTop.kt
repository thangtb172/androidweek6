package com.thesis.android_challenge_w5.movie

data class MovieTop (
    val page: Long? = null,
    val results: List<Movie>? = null,
    val totalPages: Long? = null,
    val totalResults: Long? = null
)