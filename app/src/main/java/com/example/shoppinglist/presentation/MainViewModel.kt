package com.example.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShoppListRepositoryImpl
import com.example.shoppinglist.domain.DeleteShoppItemUseCase
import com.example.shoppinglist.domain.GetShoppListUseCase
import com.example.shoppinglist.domain.RefactorShoppItemUseCase
import com.example.shoppinglist.domain.ShoppItem

class MainViewModel: ViewModel() {

    private val repository = ShoppListRepositoryImpl

    private val getShoppListUseCase = GetShoppListUseCase(repository)
    private val deleteShoppItemUseCase = DeleteShoppItemUseCase(repository)
    private val refactorShoppItemUseCase = RefactorShoppItemUseCase(repository)

    val shoppList = MutableLiveData<List<ShoppItem>>()

    fun getShoppList(){
        val list = getShoppListUseCase.getShoppList()
        shoppList.value = list
    }

    fun deleteShoppList(shoppItem: ShoppItem){
        deleteShoppItemUseCase.deleteShoppItem(shoppItem)
        getShoppList()
    }
    fun changeEnableState(shoppItem: ShoppItem){
        val newShoppItem = shoppItem.copy(enabled = !shoppItem.enabled)
        refactorShoppItemUseCase.refactorShoppItem(newShoppItem)
        getShoppList()
    }
}