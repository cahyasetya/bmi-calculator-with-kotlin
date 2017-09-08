package id.my.developer.bmicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import id.my.developer.bmicalculator.bmiactivity.Presenter
import id.my.developer.bmicalculator.models.BMI

class BMIActivity : AppCompatActivity() {
    val presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        init()
    }

    fun init(){
        val beratField = findViewById(R.id.berat_field) as EditText
        val tinggiField = findViewById(R.id.tinggi_field) as EditText

        val calculateButton = findViewById(R.id.hitung_button) as Button
        calculateButton.setOnClickListener() {
            val bmi = BMI(value = presenter.calculateBMI(beratField.text.toString().toDouble(), tinggiField.text.toString().toDouble()))

            showResultDialog(bmi)
        }
    }

    fun showResultDialog(bmi: BMI){
        val view = layoutInflater.inflate(R.layout.bmi_result_view, null)

        val dialog = AlertDialog.Builder(this).setView(view).show()

        val bmiFieldDialog = view.findViewById<TextView>(R.id.bmi_field)
        val kategoriFieldDialog = view.findViewById<TextView>(R.id.kategori_field)
        val selesaiButton = view.findViewById<Button>(R.id.selesai_button)
        selesaiButton.setOnClickListener{dialog.dismiss()}

        bmiFieldDialog.setText(bmi.toString())
        bmiFieldDialog.setTextColor(ContextCompat.getColor(this, bmi.color))
        kategoriFieldDialog.setText(bmi.kategori)
    }
}
