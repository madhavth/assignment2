package com.example.weektwoassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weektwoassignment2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listOfFoods = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.btnDecide.setOnClickListener {
            val random = listOfFoods.random()
            binding.tvChosenFood.text = random
        }

        binding.btnAddFood.setOnClickListener {
            val newFood = binding.etFood.text.toString()
            if (newFood.isNotEmpty()) {
                listOfFoods.add(newFood)
                binding.etFood.text.clear()
            }
        }
    }
}