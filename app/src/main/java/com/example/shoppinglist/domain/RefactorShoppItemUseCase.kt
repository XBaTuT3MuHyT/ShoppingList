package com.example.shoppinglist.domain

class RefactorShoppItemUseCase(private val shoppListRepository: ShoppListRepository) {
    fun refactorShoppItem(shoppItem: ShoppItem){
        shoppListRepository.refactorShoppItem(shoppItem)
    }
}