package com.example.dates__implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialer = findViewById<CardView>(R.id.Dialer)
        val gallery = findViewById<CardView>(R.id.Gallery)
        dialer.setOnClickListener(){
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        gallery.setOnClickListener(){
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}