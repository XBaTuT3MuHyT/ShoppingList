package com.example.shoppinglist.domain

class GetShoppItemByIdUseCase(private val shoppListRepository: ShoppListRepository) {
    fun getShoppItemById(id: Int): ShoppItem{
        return shoppListRepository.getShoppItemById(id)
    }
}