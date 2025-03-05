package com.example.helloapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHello.setOnClickListener {
            var str : String = binding.inData.text.toString()
            binding.textHello.setText(" ✮⋆˙ Hello, $str! ✮⋆˙ ")
        }
    }
}