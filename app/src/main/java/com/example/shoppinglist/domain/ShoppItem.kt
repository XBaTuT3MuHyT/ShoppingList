package com.example.shoppinglist.domain

data class ShoppItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean,
)