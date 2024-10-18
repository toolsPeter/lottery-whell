package com.example.lotterywheel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lotterywheel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.wheelview.viewTreeObserver.addOnGlobalLayoutListener {
            val width = binding.wheelview.width
            binding.wheelview.layoutParams.height = width
            binding.wheelview.requestLayout() // 重新請求佈局
        }

        binding.wheelview.draw_wheel(14)
        binding.button.setOnClickListener{
            binding.wheelview.wheel()
        }
    }
}