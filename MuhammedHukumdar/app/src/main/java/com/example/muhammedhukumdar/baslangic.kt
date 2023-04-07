package com.example.muhammedhukumdar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.TextView

class baslangic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)
        var text = findViewById<TextView>(R.id.textView)
        text.setTextSize(0.0F)
        object: CountDownTimer(5000,1){
            override fun onTick(p0: Long) {
                val deger = (3000-p0)/10
                if(deger < 50){
                    text.setTextSize(deger.toFloat())
                }
            }
            override fun onFinish() {
                var gecis= Intent(applicationContext, MainActivity::class.java)
                startActivity(gecis)
                finish()
            }
        }.start()
    }
}