package com.example.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)

        val user1 = UserData("Mahdi" , "Hamdi" , 12)
        val user2 = UserData("Ali" , "Mahdavi" , 13)
        binding.user1 = user1

        binding.change.setOnClickListener {
            binding.user1 = user2
        }
    }
}