package com.example.muhammedhukumdar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Secim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secim)
        var isim:String = ""
        var tuz:String = ""
        var aci:String = ""
        var inputText = findViewById<EditText>(R.id.editTextTextPersonName)
        var sw1 = findViewById<Switch>(R.id.switch1)
        var sw2 = findViewById<Switch>(R.id.switch2)
        var sw3 = findViewById<Switch>(R.id.switch3)
        var sw4 = findViewById<Switch>(R.id.switch4)
        var sw5 = findViewById<Switch>(R.id.switch5)
        var sw6 = findViewById<Switch>(R.id.switch6)
        var sw7 = findViewById<Switch>(R.id.switch7)
        var sw8 = findViewById<Switch>(R.id.switch8)
        var sw9 = findViewById<Switch>(R.id.switch9)
        var sw10 = findViewById<Switch>(R.id.switch10)
        var sw11 = findViewById<Switch>(R.id.switch11)
        var sw12 = findViewById<Switch>(R.id.switch12)
        var sb1 = findViewById<SeekBar>(R.id.seekBar)
        var sb2 = findViewById<SeekBar>(R.id.seekBar2)
        var text1 = findViewById<TextView>(R.id.textView2)
        var buton = findViewById<Button>(R.id.button2)
        var alinanIsim = intent.getStringExtra("isim")
        text1.text = "$alinanIsim Çorbası"
        if (alinanIsim == "Ezogelin") {
            sw1.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw2.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Nane,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw8.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Kıtır,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Düğün") {
            sw1.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw2.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Nane,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw8.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Kıtır,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Mercimek") {
            sw1.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw2.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Nane,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw8.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Kıtır,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Brokoli") {
            sw1.visibility = View.INVISIBLE
            sw2.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw5.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw10.visibility = View.INVISIBLE
            sw11.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw9.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
        } else if (alinanIsim == "Kelle-Paça") {
            sw2.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw11.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw1.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Sarımsak,"
                }
            }
            sw3.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Dil,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw6.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Beyin,"
                }
            }
            sw7.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Sirke,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
        } else if (alinanIsim == "Yayla") {
            sw1.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw10.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw2.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Nane,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw8.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Kıtır,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Şehriye") {
            sw1.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw2.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Nane,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Domates") {
            sw1.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw2.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Nane,"
                }
            }
            sw4.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Kaşar,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw8.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Kıtır,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
            sw12.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Terbiye,"
                }
            }
        } else if (alinanIsim == "Tarhana") {
            sw1.visibility = View.INVISIBLE
            sw2.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw10.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Mantar") {
            sw1.visibility = View.INVISIBLE
            sw2.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw5.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw10.visibility = View.INVISIBLE
            sw11.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw9.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Krema,"
                }
            }
        } else if (alinanIsim == "İşkembe") {
            sw2.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw9.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw1.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Sarımsak,"
                }
            }
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw7.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Sirke,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
            sw11.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Toz Biber,"
                }
            }
        } else if (alinanIsim == "Tavuk") {
            sw1.visibility = View.INVISIBLE
            sw2.visibility = View.INVISIBLE
            sw3.visibility = View.INVISIBLE
            sw4.visibility = View.INVISIBLE
            sw6.visibility = View.INVISIBLE
            sw7.visibility = View.INVISIBLE
            sw8.visibility = View.INVISIBLE
            sw11.visibility = View.INVISIBLE
            sw12.visibility = View.INVISIBLE
            sw5.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Yağ,"
                }
            }
            sw9.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Krema,"
                }
            }
            sw10.setOnCheckedChangeListener{ compoundButton, b ->
                if (b){
                    isim += "Limon,"
                }
            }
        }
        tuz = "Az Tuzlu"
        sb1.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(sb1.progress == 1){
                    tuz = "Orta Tuzlu"
                } else if(sb1.progress == 2){
                    val uyari = AlertDialog.Builder(sb1.context)
                    uyari.setTitle("Uyarı!!")
                    uyari.setMessage("Bu kadar tuz istediğinize emin misiniz")
                    uyari.setIcon(R.drawable.salt)
                    uyari.setCancelable(false)
                    uyari.setPositiveButton("Evet"){ DialogInterface, i->
                        tuz = "Bol Tuzlu"
                        Toast.makeText(applicationContext,"Bol Tuzlu Çorba",Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır"){DialogInterface, i->
                        sb1.progress = 1
                    }
                    uyari.create().show()
                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {

            }
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        aci = "Az Acılı"
        sb2.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(sb2.progress == 1){
                    aci = "Orta Acılı"
                } else if(sb2.progress == 2){
                    val uyari = AlertDialog.Builder(sb1.context)
                    uyari.setTitle("Uyarı!!")
                    uyari.setMessage("Bu kadar aci istediğinize emin misiniz")
                    uyari.setIcon(R.drawable.aci)
                    uyari.setCancelable(false)
                    uyari.setPositiveButton("Evet"){ DialogInterface, i->
                        aci = "Bol Acılı"
                        Toast.makeText(applicationContext,"Bol Acılı Çorba",Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır"){DialogInterface, i->
                        sb2.progress = 1
                    }
                    uyari.create().show()
                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {

            }
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        buton.setOnClickListener {
            var istek = inputText.text.toString()
            val uyari = AlertDialog.Builder(this)
            uyari.setTitle("Uyarı!!")
            uyari.setMessage("Siparişiniz Hazırlanacaktır.Devam etmek istiyor musunuz?")
            uyari.setIcon(R.drawable.logo)
            uyari.setCancelable(false)
            uyari.setPositiveButton("Evet") { DialogInterface, i ->
                var gecis= Intent(this, SonSayfa::class.java)
                gecis.putExtra("isim",isim)
                gecis.putExtra("isim1",alinanIsim)
                gecis.putExtra("isim2",tuz)
                gecis.putExtra("isim3",aci)
                gecis.putExtra("isim4",istek)
                isim = ""
                tuz = ""
                aci = ""
                startActivity(gecis)
                finish()
            }
            uyari.setNegativeButton("Tekrar Kontrol Etmek İstiyorum") { DialogInterface, i ->

            }
            uyari.create().show()
        }
    }
}