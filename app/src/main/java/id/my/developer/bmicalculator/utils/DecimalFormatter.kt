package id.my.developer.bmicalculator.utils

/**
 * Created by light on 28/08/2017.
 */
object DecimalFormatter {
    fun format(value: Double):String{
        return String.format("%.2f", value)
    }
}