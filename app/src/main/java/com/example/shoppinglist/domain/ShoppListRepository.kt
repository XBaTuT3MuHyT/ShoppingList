package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShoppListRepository {
    fun getShoppList(): LiveData<List<ShoppItem>>
    fun addShoppItem(shoppItem: ShoppItem)
    fun deleteShoppItem(shoppItem: ShoppItem)
    fun refactorShoppItem(shoppItem: ShoppItem)
    fun getShoppItemById(id: Int): ShoppItem
}