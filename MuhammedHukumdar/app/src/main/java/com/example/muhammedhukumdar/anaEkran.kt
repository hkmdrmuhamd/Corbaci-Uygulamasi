package com.example.muhammedhukumdar

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class anaEkran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_ekran)
        var ch = findViewById<CheckBox>(R.id.checkBox)
        var buton = findViewById<Button>(R.id.button)
        var rg = findViewById<RadioGroup>(R.id.radioGroup)
        var rb1 =findViewById<RadioButton>(R.id.radioButton1)
        var rb2 =findViewById<RadioButton>(R.id.radioButton2)
        var rb3 =findViewById<RadioButton>(R.id.radioButton3)
        var rb4 =findViewById<RadioButton>(R.id.radioButton4)
        var rb5 =findViewById<RadioButton>(R.id.radioButton5)
        var rb6 =findViewById<RadioButton>(R.id.radioButton6)
        var rb7 =findViewById<RadioButton>(R.id.radioButton7)
        var rb8 =findViewById<RadioButton>(R.id.radioButton8)
        var rb9 =findViewById<RadioButton>(R.id.radioButton9)
        var rb10 =findViewById<RadioButton>(R.id.radioButton10)
        var rb11 =findViewById<RadioButton>(R.id.radioButton11)
        var rb12 =findViewById<RadioButton>(R.id.radioButton12)
        rg.visibility = View.INVISIBLE
        buton.visibility = View.INVISIBLE
        ch.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                rg.visibility = View.VISIBLE
                buton.visibility = View.VISIBLE
            }
            if (b == false){
                rg.visibility = View.INVISIBLE
                buton.visibility = View.INVISIBLE
            }
        }
        buton.setOnClickListener{
            var rb1durum = rb1.isChecked
            var rb2durum = rb2.isChecked
            var rb3durum = rb3.isChecked
            var rb4durum = rb4.isChecked
            var rb5durum = rb5.isChecked
            var rb6durum = rb6.isChecked
            var rb7durum = rb7.isChecked
            var rb8durum = rb8.isChecked
            var rb9durum = rb9.isChecked
            var rb10durum = rb10.isChecked
            var rb11durum = rb11.isChecked
            var rb12durum = rb12.isChecked
            var tasarim = layoutInflater.inflate(R.layout.toast,null)
            var toast = Toast(applicationContext)
            toast.view = tasarim
            toast.setGravity(Gravity.BOTTOM,0,0)
            toast.duration = Toast.LENGTH_SHORT
            var toasttakiyazi = tasarim.findViewById<TextView>(R.id.textView4)
            if (rb1durum == true){
                var isim = "Ezogelin"
                toasttakiyazi.text = "Ezoelin Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb2durum == true){
                var isim = "Düğün"
                toasttakiyazi.text = "Düğün Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb3durum == true){
                var isim = "Mercimek"
                toasttakiyazi.text = "Mercimek Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb4durum == true){
                var isim = "Brokoli"
                toasttakiyazi.text = "Brokoli Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb5durum == true){
                var isim = "Kelle-Paça"
                toasttakiyazi.text = "Kelle-Paça Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb6durum == true){
                var isim = "Yayla"
                toasttakiyazi.text = "Yayla Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb7durum == true){
                var isim = "Şehriye"
                toasttakiyazi.text = "Şehriye Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb8durum == true){
                var isim = "Domates"
                toasttakiyazi.text = "Domates Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb9durum == true){
                var isim = "Tarhana"
                toasttakiyazi.text = "Tarhana Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb10durum == true){
                var isim = "Mantar"
                toasttakiyazi.text = "Mantar Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb11durum == true){
                var isim = "İşkembe"
                toasttakiyazi.text = "İşkembe Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else if (rb12durum == true){
                var isim = "Tavuk"
                toasttakiyazi.text = "Tavuk Çorbası\nGüzel Seçim\nLütfen Bekleyiniz"
                toast.show()
                Handler().postDelayed({
                    var gecis= Intent(this, Secim::class.java)
                    gecis.putExtra("isim",isim)
                    startActivity(gecis)
                    finish()
                },3000)
            }
            else {
                val uyari = AlertDialog.Builder(this)
                uyari.setTitle("Uyarı!!")
                uyari.setMessage("Lütfen tercih yapınız!!")
                uyari.setIcon(R.drawable.logo)
                uyari.setCancelable(false)
                uyari.setNeutralButton("Tekrar dene"){ DialogInterface, i->

                }
                uyari.create().show()
            }
        }
    }
}