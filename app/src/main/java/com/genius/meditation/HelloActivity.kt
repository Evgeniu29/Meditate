package com.genius.meditation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello)
        val name: String? = intent.getStringExtra("name")

        val hi: TextView = findViewById(R.id.img_7)

        val glhf: String by lazy { resources.getString(R.string.hi) }

        hi.text=  glhf+","+" "+name

        val go:ImageButton = findViewById(R.id.go)

        go.setOnLongClickListener(View.OnLongClickListener {


            val intent = Intent(this@HelloActivity,TabActivity::class.java)

            startActivity(intent)

            return@OnLongClickListener true
        })

    }
}