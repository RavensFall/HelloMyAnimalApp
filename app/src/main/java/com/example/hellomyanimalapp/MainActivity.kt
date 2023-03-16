package com.example.hellomyanimalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import com.example.hellomyanimalapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Cat1 = DataCat("Spotty", "3 month", "Turkish van","Energetic",R.drawable.cat1)
        val Cat2 = DataCat("Midnight", "2 month", "Bombay","Shy",R.drawable.cat2)
        val Cat3 = DataCat("Parsifal", "1 month", "Maine Coon","Dominant",R.drawable.cat3)
        binding.button.setOnClickListener() {
            val i = Intent(this,Details::class.java)
            i.putExtra("Cat",Cat1)
            startActivity(i)
        }
        binding.button2.setOnClickListener() {
            val i = Intent(this,Details::class.java)
            i.putExtra("Cat",Cat2)
            startActivity(i)
        }
        binding.button3.setOnClickListener() {
            val i = Intent(this,Details::class.java)
            i.putExtra("Cat",Cat3)
            startActivity(i)
        }

    }


}