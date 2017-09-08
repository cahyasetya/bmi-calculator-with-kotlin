package id.my.developer.bmicalculator

import id.my.developer.bmicalculator.utils.BMICalculator
import org.junit.Test
import org.junit.Assert
import java.util.*

/**
 * Created by light on 25/08/2017.
 */
class BMICalculatorTest {
    @Test fun hitungBMI(){
        val bmi = BMICalculator.hitungBMI(65.0,1.7)
        val bmiString: String = String.format(Locale.US,"%.2f",bmi)
        Assert.assertTrue(bmiString.toDouble()==22.49)
    }

    @Test fun hitungBerat(){
        val berat = BMICalculator.hitungBerat(20.0,1.65)
        val beratString: String = String.format(Locale.US, "%.2f", berat)
        Assert.assertTrue(beratString.toDouble()==54.45)
    }
}