package com.example.hellomyanimalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellomyanimalapp.databinding.ActivityDetailsBinding


class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val CatInfo = intent.getParcelableExtra<DataCat>("Cat")
        binding.textName.text = "Name: ${CatInfo!!.name}"
        binding.textName2.text = "Age: ${CatInfo!!.age}"
        binding.textName3.text = "Breed: ${CatInfo!!.breed}"
        binding.textName4.text = "Temperament: ${CatInfo!!.temperament}"
        binding.imageView4.setImageResource(CatInfo.picture)

    }

}