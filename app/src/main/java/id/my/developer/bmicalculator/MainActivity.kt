package id.my.developer.bmicalculator

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init() {
        val weightButton = findViewById(R.id.imageView) as ImageView
        val bmiButton = findViewById(R.id.imageView2) as ImageView

        val startFadeoutAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.scale_out)

        bmiButton.startAnimation(startFadeoutAnimation)
        weightButton.startAnimation(startFadeoutAnimation)

        bmiButton.setOnClickListener(){
            val intent = Intent(this, BMIActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.scale_out,R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }

        weightButton.setOnClickListener(){
            val intent = Intent(this, BeratActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.scale_out,R.anim.fade_out)
            startActivity(intent, options.toBundle())
        }
    }
}
