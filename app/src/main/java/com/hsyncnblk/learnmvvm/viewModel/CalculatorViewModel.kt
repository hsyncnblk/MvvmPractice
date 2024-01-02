package com.hsyncnblk.learnmvvm.viewModel

import androidx.lifecycle.ViewModel
import com.hsyncnblk.learnmvvm.model.CalculateData

class CalculatorViewModel : ViewModel() {
    fun calculateSum(num1:Int,num2:Int) : CalculateData{
        val sum = num1+num2
        return CalculateData(num1, num2, sum)
    }
}