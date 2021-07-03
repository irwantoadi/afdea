package com.goprojectstudio.afdea

import android.content.Intent
import android.graphics.BlendMode
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        bottomNavigationView.selectedItemId = R.id.btn_home

        btn_tuna_rungu.setOnClickListener {
            val intent = Intent(this, EdukasiAnimasiActivity::class.java)
            startActivity(intent)
        }
        btn_tuna_wicara.setOnClickListener {
            val intent = Intent(this, EdukasiTunaWicaraActivity::class.java)
            startActivity(intent)
        }
        btn_tuna_netra.setOnClickListener {
            val intent = Intent(this, PodcastActivity::class.java)
            startActivity(intent)
        }
        btn_soal.setOnClickListener {
            val intent = Intent(this, SoalActivity::class.java)
            startActivity(intent)
        }
        btn_komunitas.setOnClickListener {
            val intent = Intent(this, ForumActivity::class.java)
            startActivity(intent)
        }
    }
}