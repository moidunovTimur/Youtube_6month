package com.example.youtube_6month.model

data class Item(
    val contentDetails: ContentDetails,
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
)