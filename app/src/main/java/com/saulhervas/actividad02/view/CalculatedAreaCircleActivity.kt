package com.saulhervas.actividad02.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.saulhervas.actividad02.R
import com.saulhervas.actividad02.databinding.ActivityCalculatedAreaCircleBinding
import com.saulhervas.actividad02.viewmodel.CircleViewModel

class CalculatedAreaCircleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatedAreaCircleBinding
    private lateinit var circleViewModel: CircleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatedAreaCircleBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        circleViewModel = ViewModelProvider(this).get(CircleViewModel::class.java)

        binding.btnCalcular.setOnClickListener {
            calculateShowArea()
        }
        circleViewModel.result.observe(this) {
            binding.twResultArea.text = it
        }
    }

    private fun calculateShowArea() {
        val radiusText = binding.etRadius.text.toString()
        if (radiusText.isNotEmpty()) {
            val radius = radiusText.toDouble()
            circleViewModel.calculateArea(radius)
        } else {
            binding.twResultArea.text = "Por favor, introduce el valor del radio"
        }
    }
}