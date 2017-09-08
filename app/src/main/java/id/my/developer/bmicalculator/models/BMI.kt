package id.my.developer.bmicalculator.models

import id.my.developer.bmicalculator.R
import id.my.developer.bmicalculator.utils.DecimalFormatter

/**
 * Created by light on 28/08/2017.
 */
data class BMI(val value:Double) {
    val bmiString = DecimalFormatter.format(value)
    val bmi:Double = bmiString.toDouble()
    val kategori = when(bmi) {
        in 0.0..17.0 -> "Kurus, kekurangan berat badan berat"
        in 17.0..18.4 -> "Kurus, kekurangan berat badan ringan"
        in 18.5..25.0 -> "Normal"
        in 25.1..27.0 -> "Gemuk, kelebihan berat badan ringan"
        else -> "Gemuk, kelebihan berat badan tingkat berat"
    }
    val color = when(bmi){
        in 0.0 .. 18.4  -> R.color.red
        in 18.5 .. 25.0 -> R.color.green
        else -> R.color.red
    }

    override fun toString(): String {
        return DecimalFormatter.format(bmi)
    }
}