package com.nazhiba.pemilu

import android.content.Intent
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview = findViewById<TextView>(R.id.KPU)
        val anies = findViewById<Button>(R.id.amin)
        val prabowo = findViewById<Button>(R.id.prabran)
        val ganjar_afk = findViewById<Button>(R.id.gama)
        val masukkan_saran = findViewById<EditText>(R.id.saran)
        val pilih = findViewById<Button>(R.id.pilih)
        val info = findViewById<TextView>(R.id.info)
        val cetak = findViewById<Button>(R.id.cetak)
        var saran_anda = ""

        anies.setOnClickListener(){
            pilih.setOnClickListener(){
                saran_anda = masukkan_saran.text.toString()
                val thanks = "Terimakasih :) #pemilu2024"
                textview.text = thanks

                if (saran_anda == ""){
                    textview.text = "SARANMU!!!"
                    info.text = ""
                    Toast.makeText(this@MainActivity,"tolong masukkan saran anda",Toast.LENGTH_SHORT).show()
                    cetak.visibility = INVISIBLE
                } else {
                    val pesan_dan_info = "Anda memberikan saran kepada Anies & Cak Imin untuk: ${saran_anda}"
                    info.text = pesan_dan_info
                    cetak.visibility = VISIBLE

                }
                masukkan_saran.text.clear()
            }
        }
        prabowo.setOnClickListener(){
            pilih.setOnClickListener(){
                saran_anda = masukkan_saran.text.toString()
                val thanks = "Terimakasih :) #pemilu2024"
                textview.text = thanks
                if (saran_anda == ""){
                    textview.text = "SARANMU!!!"
                    info.text = ""
                    Toast.makeText(this@MainActivity,"tolong masukkan saran anda",Toast.LENGTH_SHORT).show()
                    cetak.visibility = INVISIBLE
                }else{
                    val pesan_dan_info = "Anda memberikan saran kepada Prabowo & Gibran untuk: ${saran_anda}"
                    info.text = pesan_dan_info
                    cetak.visibility = VISIBLE
                }
                masukkan_saran.text.clear()
            }
        }
        ganjar_afk.setOnClickListener(){
            pilih.setOnClickListener(){
                saran_anda = masukkan_saran.text.toString()
                val thanks = "Terimakasih :) #pemilu2024"
                textview.text = thanks
                if (saran_anda == ""){
                    textview.text = "SARANMU!!!"
                    info.text = ""
                    Toast.makeText(this@MainActivity,"tolong masukkan saran anda",Toast.LENGTH_SHORT).show()
                    cetak.visibility = INVISIBLE
                }else{
                    val pesan_dan_info = "Anda memberikan saran kepada Ganjar & Mahfud untuk: ${saran_anda}"
                    info.text = pesan_dan_info
                    cetak.visibility = VISIBLE
                }
                masukkan_saran.text.clear()
            }
        }
        cetak.setOnClickListener(){
            val i = Intent(this,MainActivity_dua::class.java)
            startActivity(i)
            intent.putExtra("PESAN",saran_anda)
            startActivity(intent)

        }
    }
}