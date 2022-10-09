package com.example.shoppinglist.domain

interface ShoppListRepository {
    fun getShoppList(): List<ShoppItem>
    fun addShoppItem(shoppItem: ShoppItem)
    fun deleteShoppItem(shoppItem: ShoppItem)
    fun refactorShoppItem(shoppItem: ShoppItem)
    fun getShoppItemById(id: Int): ShoppItem
}