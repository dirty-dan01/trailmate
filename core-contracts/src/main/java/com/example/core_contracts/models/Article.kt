package com.example.core_contracts.models

data class Article(
    val id: String,
    val title: String,
    val body: String,
    val saved: Boolean,
)
