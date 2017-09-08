package id.my.developer.bmicalculator.beratactivity

import android.content.Context
import id.my.developer.bmicalculator.utils.BMICalculator

/**
 * Created by light on 29/08/2017.
 */
class Presenter(context:Context) {
    val context:Context=context
    fun calculateBerat(bmi:Double, tinggi:Double):Double{
        return BMICalculator.hitungBerat(bmi, tinggi)
    }
}