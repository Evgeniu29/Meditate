package com.genius.meditation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.genius.meditation.databinding.About3Binding
import java.util.*

class About3Activity : AppCompatActivity() {

    private lateinit var binding: About3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = About3Binding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        val timer3: ImageButton = findViewById(R.id.timer3)

        timer3.setOnLongClickListener(View.OnLongClickListener {

            timer3.background=getDrawable(R.drawable.orange)


            val intent: Intent = Intent(this@About3Activity, ProcessActivity::class.java)

            startActivity(intent)

            return@OnLongClickListener true
        })

    }

}
