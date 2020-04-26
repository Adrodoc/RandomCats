package com.example.randomcats

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.MemoryPolicy
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextCat = findViewById<Button>(R.id.nextCat)
        val catImage = findViewById<ImageView>(R.id.catImage)
        val url = "https://loremflickr.com/1080/720/cat"
        nextCat.setOnClickListener {
            Picasso.get()
                .load(url)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .into(catImage)
        }
    }
}
