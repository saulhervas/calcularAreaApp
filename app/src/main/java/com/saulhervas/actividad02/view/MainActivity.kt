package com.saulhervas.actividad02.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.saulhervas.actividad02.R
import com.saulhervas.actividad02.controller.SquareController
import com.saulhervas.actividad02.databinding.ActivityMainBinding
import com.saulhervas.actividad02.model.Square

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.imSquare.setOnClickListener {
            var square = Square(5.7)
            val intent = square.navigateToCalculatedAreaActivity(this)
            startActivity(intent)
        }
    }

}