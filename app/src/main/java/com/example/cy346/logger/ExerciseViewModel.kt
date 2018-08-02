package com.example.cy346.logger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExerciseViewModel : ViewModel() {
    private var exercises: MutableLiveData<Array<Exercise>>? = null

    fun getCurrentName(): MutableLiveData<Array<Exercise>> {
        return exercises ?: MutableLiveData()
    }
}