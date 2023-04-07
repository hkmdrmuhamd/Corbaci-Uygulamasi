package com.example.muhammedhukumdar

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class SonSayfa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_son_sayfa)
        var text1 = findViewById<TextView>(R.id.textView9)
        var text2 = findViewById<TextView>(R.id.textView11)
        var text3 = findViewById<TextView>(R.id.textView13)
        var imageButon = findViewById<ImageButton>(R.id.imageButton2)
        var buton = findViewById<TextView>(R.id.textView10)
        var alinan = intent.getStringExtra("isim")
        var corbaAd = intent.getStringExtra("isim1")
        var tuz = intent.getStringExtra("isim2")
        var aci = intent.getStringExtra("isim3")
        var input = intent.getStringExtra("isim4")
        text2.text = "$alinan Olsun"
        text1.text = "Bir $corbaAd Çorbası Çeeek,$tuz ve $aci Olsun. İçinde"
        text3.text = "Ekstra İstek: $input"
        imageButon.setOnClickListener{
            val uyari = AlertDialog.Builder(this)
            uyari.setTitle("Uyarı!!")
            uyari.setMessage("Çıkış yapmak istiyor musunuz?")
            uyari.setIcon(R.drawable.logo)
            uyari.setCancelable(false)
            uyari.setPositiveButton("Evet"){ DialogInterface, i->
                System.exit(0)
            }
            uyari.setNegativeButton("Hayır"){DialogInterface, i->

            }
            uyari.create().show()
        }
        object :CountDownTimer(10000,1){
            override fun onTick(p0: Long) {
                if(p0.toInt()%1000>200){
                    buton.setTextColor(Color.argb(255,255,255,255))
                } else{
                    buton.setTextColor(Color.argb(0,255,255,255))
                }
            }

            override fun onFinish() {
                buton.setTextColor(Color.argb(255,255,255,255))
            }
        }.start()
        buton.setOnClickListener{
            var gecis= Intent(this, anaEkran::class.java)
            startActivity(gecis)
            finish()
        }
    }
}