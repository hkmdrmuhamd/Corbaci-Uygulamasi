package com.example.muhammedhukumdar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x:Int = 0
        var buton1 = findViewById<Button>(R.id.button1)
        var buton2 = findViewById<Button>(R.id.button3)
        var buton3 = findViewById<Button>(R.id.button4)
        var buton4 = findViewById<Button>(R.id.button5)
        var buton5 = findViewById<Button>(R.id.button6)
        var buton6 = findViewById<Button>(R.id.button7)
        var buton7 = findViewById<Button>(R.id.button8)
        var buton8 = findViewById<Button>(R.id.button9)
        var resim1 = findViewById<ImageView>(R.id.imageView6)
        var resim2 = findViewById<ImageView>(R.id.imageView7)
        var resim3 = findViewById<ImageView>(R.id.imageView8)
        var resim4 = findViewById<ImageView>(R.id.imageView9)
        var resim5 = findViewById<ImageView>(R.id.imageView10)
        var resim6 = findViewById<ImageView>(R.id.imageView11)
        var resim7 = findViewById<ImageView>(R.id.imageView12)
        var resim8 = findViewById<ImageView>(R.id.imageView13)
        var pb = findViewById<ProgressBar>(R.id.progressBar)
        pb.visibility = View.INVISIBLE
        resim1.visibility = View.INVISIBLE
        resim2.visibility = View.INVISIBLE
        resim3.visibility = View.INVISIBLE
        resim4.visibility = View.INVISIBLE
        resim5.visibility = View.INVISIBLE
        resim6.visibility = View.INVISIBLE
        resim7.visibility = View.INVISIBLE
        resim8.visibility = View.INVISIBLE

        buton1.setOnClickListener {
            if (x == 0) {
                resim1.visibility = View.VISIBLE
                x = 1
            }
        }
        buton2.setOnClickListener {
            if (x == 1) {
                resim2.visibility = View.VISIBLE
                x = 2
            }
        }
        buton3.setOnClickListener {
            if (x == 2) {
                resim3.visibility = View.VISIBLE
                x = 3
            }
        }
        buton4.setOnClickListener {
            if (x == 3) {
                resim4.visibility = View.VISIBLE
                x = 4
            }
        }
        buton5.setOnClickListener {
            if (x == 4) {
                resim5.visibility = View.VISIBLE
                x = 5
            }
        }
        buton6.setOnClickListener {
            if(x == 5){
                resim6.visibility = View.VISIBLE
                x = 6
            }
        }
        buton7.setOnClickListener {
            if(x == 6){
                resim7.visibility = View.VISIBLE
                x = 7
            }
        }
        buton8.setOnClickListener {
            if(x == 7){
                resim8.visibility = View.VISIBLE
                pb.visibility = View.VISIBLE
                var gecis = Intent(this, anaEkran::class.java)
                startActivity(gecis)
                finish()
            }
        }
    }
}