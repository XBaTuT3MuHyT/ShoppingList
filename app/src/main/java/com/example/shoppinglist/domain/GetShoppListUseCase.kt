package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

class GetShoppListUseCase(private val shoppListRepository: ShoppListRepository) {
    fun getShoppList(): LiveData<List<ShoppItem>>{
        return shoppListRepository.getShoppList()
    }
}