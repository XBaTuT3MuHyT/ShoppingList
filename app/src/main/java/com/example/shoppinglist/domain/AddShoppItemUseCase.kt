package com.example.shoppinglist.domain

class AddShoppItemUseCase(private val shoppListRepository: ShoppListRepository) {
    fun addShoppItem(shoppItem: ShoppItem){
        shoppListRepository.addShoppItem(shoppItem)
    }
}