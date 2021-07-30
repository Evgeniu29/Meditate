package com.genius.meditation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:ImageButton = findViewById(R.id.img_5)

        val editText:EditText = findViewById(R.id.editText)

        button.setOnLongClickListener{

            val intent = Intent(this@InputActivity, HelloActivity::class.java)

            var text = editText.text.toString()

            intent.putExtra("name", text)

            startActivity(intent)

            return@setOnLongClickListener true
        }

        }

}