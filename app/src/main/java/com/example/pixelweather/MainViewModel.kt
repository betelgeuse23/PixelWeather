package com.example.pixelweather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pixelweather.fragments.Weather

class MainViewModel : ViewModel() {
    val liveCur = MutableLiveData<Weather>()
    val liveList = MutableLiveData<List<Weather>>()
}