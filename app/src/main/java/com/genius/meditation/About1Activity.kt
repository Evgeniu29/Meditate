package com.genius.meditation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.genius.meditation.databinding.TabBinding

class About1Activity : AppCompatActivity() {


    private lateinit var binding: TabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = TabBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        

    }

}
