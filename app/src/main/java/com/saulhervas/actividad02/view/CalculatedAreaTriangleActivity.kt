package com.saulhervas.actividad02.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.saulhervas.actividad02.R
import com.saulhervas.actividad02.databinding.ActivityCalculatedAreaTriangleBinding
import com.saulhervas.actividad02.viewmodel.TriangleViewModel

class CalculatedAreaTriangleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatedAreaTriangleBinding
    private lateinit var triangleViewModel: TriangleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatedAreaTriangleBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        triangleViewModel = ViewModelProvider(this).get(TriangleViewModel::class.java)

        binding.btnCalcular.setOnClickListener {
            calculateShowArea()
        }
        triangleViewModel.result.observe(this) {
            binding.twResultArea.text = it
        }
    }

    private fun calculateShowArea() {
        val baseText = binding.etBase.text.toString()
        val heightText = binding.etHeight.text.toString()

        if (baseText.isNotEmpty() && heightText.isNotEmpty()) {
            val base = baseText.toDouble()
            val height = heightText.toDouble()
            triangleViewModel.calculateArea(base, height)
        } else {
            binding.twResultArea.text = "Por favor, introduce el valor de la base y la altura"
        }
    }
}