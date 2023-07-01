package com.example.calculatorbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorbasic.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            val firstNumber = binding.firstNumber.text.toString().toInt()
            val secondNumber = binding.secondNumber.text.toString().toInt()
            val result = firstNumber + secondNumber
            binding.resultTextView.text = result.toString()
        }

        binding.subtractButton.setOnClickListener {
            val firstNumber = binding.firstNumber.text.toString().toInt()
            val secondNumber = binding.secondNumber.text.toString().toInt()
            val result = firstNumber - secondNumber
            binding.resultTextView.text = result.toString()
        }

        binding.multiplyButton.setOnClickListener {
            val firstNumber = binding.firstNumber.text.toString().toInt()
            val secondNumber = binding.secondNumber.text.toString().toInt()
            val result = firstNumber * secondNumber
            binding.resultTextView.text = result.toString()
        }

        binding.divideButton.setOnClickListener {
            val firstNumber = binding.firstNumber.text.toString().toInt()
            val secondNumber = binding.secondNumber.text.toString().toInt()
            val result = firstNumber / secondNumber
            binding.resultTextView.text = result.toString()
        }
    }
}