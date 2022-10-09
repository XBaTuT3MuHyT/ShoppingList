package com.example.shoppinglist.domain

class GetShoppListUseCase(private val shoppListRepository: ShoppListRepository) {
    fun getShoppList(): List<ShoppItem>{
        return shoppListRepository.getShoppList()
    }
}