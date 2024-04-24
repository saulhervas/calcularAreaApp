package com.saulhervas.actividad02.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.saulhervas.actividad02.R
import com.saulhervas.actividad02.databinding.ActivityCalculatedAreaSquareActivityBinding
import com.saulhervas.actividad02.viewmodel.SquareViewModel

class CalculatedAreaSquareActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatedAreaSquareActivityBinding
    private lateinit var squareViewModel: SquareViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatedAreaSquareActivityBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        squareViewModel = ViewModelProvider(this).get(SquareViewModel::class.java)

        binding.btnCalcular.setOnClickListener {
            calculateShowArea()
        }

        squareViewModel.result.observe(this) {
            binding.twResultArea.text = it
        }
    }

    private fun calculateShowArea() {
        val sideText = binding.etSide.text.toString()
        if (sideText.isNotEmpty()) {
            val side = sideText.toDouble()
            squareViewModel.calculateArea(side)
        } else {
            binding.twResultArea.text = "Por favor, introduce el valor del lado"
        }
    }
}
