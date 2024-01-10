package com.example.travelphotoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.*
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currentImage = 0

    lateinit var image : ImageView
    var places = arrayOf("Golden Temple", "India Gate", "Russia", "Taj Mahal")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val placeName = findViewById<TextView>(R.id.ImgName)

        next.setOnClickListener {
            var idCurrentImageString = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image =  findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (currentImage+1)%4
            var idImgtoShwString = "pic$currentImage"
            var idImgtoShwInt = this.resources.getIdentifier(idImgtoShwString, "id", packageName)
            image =  findViewById(idImgtoShwInt)
            image.alpha = 1f
            placeName.text = places[currentImage]
        }

        prev.setOnClickListener {
            var idCurrentImageString = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image =  findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (currentImage+1)%4
            var idImgtoShwString = "pic$currentImage"

            var idImgtoShwInt = this.resources.getIdentifier(idImgtoShwString, "id", packageName)
            image =  findViewById(idImgtoShwInt)
            image.alpha = 1f
            placeName.text = places[currentImage]
        }

    }
}