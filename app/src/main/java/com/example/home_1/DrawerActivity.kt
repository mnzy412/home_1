package com.example.home_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_1.databinding.ActivityDrawerBinding

class DrawerActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityDrawerBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}