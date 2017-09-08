package id.my.developer.bmicalculator.bmiactivity

import android.content.Context
import id.my.developer.bmicalculator.utils.BMICalculator

/**
 * Created by light on 28/08/2017.
 */
class Presenter(context: Context){
    val context : Context = context
    fun calculateBMI(berat: Double, tinggi: Double):Double{
        return BMICalculator.hitungBMI(berat, tinggi)
    }


}