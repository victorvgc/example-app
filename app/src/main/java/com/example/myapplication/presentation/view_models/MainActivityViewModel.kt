package com.example.myapplication.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.myapplication.domain.models.User

class MainActivityViewModel : ViewModel() {

    private val userLiveData: MutableLiveData<User> = MutableLiveData()// call use case
    private val nameLiveData: LiveData<String> = Transformations.map(userLiveData) {
        it.name
    }
    private val emailLiveData: LiveData<String> = Transformations.map(userLiveData) {
        it.email
    }
    private var p = 0


    fun getText() : LiveData<String> {

        return nameLiveData
    }

    /*private fun setText(p: Int) {
        textLiveData.postValue("Test $p")
    }*/

    fun addP() {
        p++

        //setText(p)
    }
}