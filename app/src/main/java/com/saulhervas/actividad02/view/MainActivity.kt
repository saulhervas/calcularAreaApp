package com.saulhervas.actividad02.view

import android.os.Bundle

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.saulhervas.actividad02.R
import com.saulhervas.actividad02.databinding.ActivityMainBinding
import com.saulhervas.actividad02.model.Circle
import com.saulhervas.actividad02.model.Square
import com.saulhervas.actividad02.model.Triangle

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
            var square = Square(0.0)
            val intent = square.navigateToCalculatedAreaActivity(this)
            startActivity(intent)
        }

        binding.imCircle.setOnClickListener {
            var circle = Circle(0.0)
            val intent = circle.navigateToCalculatedAreaActivity(this)
            startActivity(intent)
        }

        binding.imTriangle.setOnClickListener {
            var triangle = Triangle(0.0, 0.0)
            val intent = triangle.navigateToCalculatedAreaActivity(this)
            startActivity(intent)
        }
    }

}