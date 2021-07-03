package com.goprojectstudio.afdea

import com.goprojectstudio.afdea.R
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class SettingActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private lateinit var imageView: ImageView
    lateinit var handler: Handler
    lateinit var handlerSound: Handler
    lateinit var handlerGif: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        imageView = findViewById(R.id.image_voice)

        mediaPlayer = MediaPlayer.create(this, R.raw.selamat_datang_voice_cut_mp3cutnet)

        handler = Handler()
        handler.postDelayed({
            imageView.setImageResource(R.drawable.google_mute)
            var intent = Intent(this@SettingActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 6500)

        handlerSound = Handler()
        handlerSound.postDelayed({
            mediaPlayer?.start()
            Glide.with(this).load(R.raw.ezgif_com_gif_maker).into(imageView)
        }, 4000)

        handlerGif = Handler()
        handlerGif.postDelayed({
        }, 3000)
    }
}