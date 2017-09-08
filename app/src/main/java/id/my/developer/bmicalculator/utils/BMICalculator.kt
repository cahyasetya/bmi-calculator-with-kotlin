package id.my.developer.bmicalculator.utils

/**
 * Created by light on 25/08/2017.
 */
object BMICalculator {
    fun hitungBMI(berat: Double, tinggi: Double)=berat/(tinggi*tinggi)
    fun hitungBerat(bmi: Double, tinggi: Double)=bmi*tinggi*tinggi
}