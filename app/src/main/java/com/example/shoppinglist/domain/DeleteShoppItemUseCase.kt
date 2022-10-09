package com.example.shoppinglist.domain

class DeleteShoppItemUseCase(private val shoppListRepository: ShoppListRepository) {
    fun deleteShoppItem(shoppItem: ShoppItem){
        shoppListRepository.deleteShoppItem(shoppItem)
    }
}