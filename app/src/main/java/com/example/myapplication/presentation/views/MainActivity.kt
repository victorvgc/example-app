package com.example.myapplication.presentation.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.presentation.view_models.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = MainActivityViewModel()

        setContentView(binding.root)

        viewModel.getText().observe(this, Observer {
            binding.text = it
        })

        binding.text = "Test 0"

        binding.btn.setOnClickListener {
            //binding.text = "Test $p"
            viewModel.addP()
        }
    }
}
