package edu.chapman.monsutauoka.ui.fourth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeltaViewModel : ViewModel() {
    val num: MutableLiveData<Int> = MutableLiveData<Int>(0)
}