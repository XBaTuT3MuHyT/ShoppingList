package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShoppItem
import com.example.shoppinglist.domain.ShoppListRepository

object ShoppListRepositoryImpl: ShoppListRepository {

    private val shoppList = mutableListOf<ShoppItem>()

    private var autoIncrementId = 0

    override fun getShoppList(): List<ShoppItem> {
        return shoppList.toList()
    }

    override fun addShoppItem(shoppItem: ShoppItem) {
        if (shoppItem.id == ShoppItem.UNDEFINED_ID){
            shoppItem.id = autoIncrementId++
        }
        shoppList.add(shoppItem)
    }

    override fun deleteShoppItem(shoppItem: ShoppItem) {
        shoppList.remove(shoppItem)
    }

    override fun refactorShoppItem(shoppItem: ShoppItem) {
        val oldShoppItem = getShoppItemById(shoppItem.id)
        shoppList.remove(oldShoppItem)
        addShoppItem(shoppItem)
    }

    override fun getShoppItemById(id: Int): ShoppItem {
        return shoppList.find {
             it.id == id
        } ?: throw RuntimeException("Element with id $id not found! ")
    }
}