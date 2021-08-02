package com.genius.meditation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.genius.meditation.databinding.About1Binding
import java.util.*

class About1Activity : AppCompatActivity() {

    private lateinit var binding: About1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = About1Binding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        val timer1: ImageButton = findViewById(R.id.timer1)

        timer1.setOnLongClickListener(View.OnLongClickListener {

            timer1.background=getDrawable(R.drawable.orange)

            val intent: Intent = Intent(this@About1Activity, ProcessActivity::class.java)

            startActivity(intent)

            return@OnLongClickListener true
        })

    }

}
