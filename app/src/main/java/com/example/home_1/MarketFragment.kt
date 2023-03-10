package com.example.home_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.home_1.databinding.FragmentMarketBinding

class MarketFragment : Fragment() {
    private lateinit var viewBinding: FragmentMarketBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentMarketBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}