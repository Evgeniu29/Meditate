package com.genius.meditation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.genius.meditation.databinding.About2Binding
import java.util.*

class About2Activity : AppCompatActivity() {

    private lateinit var binding: About2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = About2Binding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        val timer2:ImageButton = findViewById(R.id.timer2)

        timer2.setOnLongClickListener(View.OnLongClickListener {

            timer2.background=getDrawable(R.drawable.orange)

            val intent: Intent = Intent(this@About2Activity, ProcessActivity::class.java)

            startActivity(intent)

            return@OnLongClickListener true
        })

    }

}
