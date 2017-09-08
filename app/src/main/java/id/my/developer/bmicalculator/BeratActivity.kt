package id.my.developer.bmicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.TextView
import id.my.developer.bmicalculator.beratactivity.Presenter
import id.my.developer.bmicalculator.utils.DecimalFormatter

class BeratActivity : AppCompatActivity() {
    val presenter=Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berat)

        init()
    }
    fun init(){
        val bmiField = findViewById(R.id.bmi_field) as TextView
        val tinggiField = findViewById(R.id.tinggi_field) as TextView
        findViewById(R.id.calculate_button).setOnClickListener {
            val berat = presenter.calculateBerat(bmiField.text.toString().toDouble(), tinggiField.text.toString().toDouble())

            showResultDialog(berat)
        }
    }
    fun showResultDialog(berat: Double){
        val view = layoutInflater.inflate(R.layout.berat_result_view, null)

        val dialog = AlertDialog.Builder(this).setView(view).show()

        val hasilFieldDialog = view.findViewById<TextView>(R.id.hasil_field)
        val selesaiButton = view.findViewById<Button>(R.id.done_button)
        selesaiButton.setOnClickListener { dialog.dismiss() }

        hasilFieldDialog.setText(DecimalFormatter.format(berat))
    }
}
