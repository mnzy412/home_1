package com.example.home_1.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_1.databinding.ActivityNotiBinding
import com.example.home_1.databinding.ActivitySearchBinding

class NotiActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityNotiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityNotiBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}