package com.genius.meditation

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.style.DoubleBounce

import com.github.ybq.android.spinkit.sprite.Sprite

import androidx.core.view.isVisible
import com.genius.meditation.databinding.TimerBinding


class ProcessActivity : AppCompatActivity() {

    private lateinit var binding: TimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TimerBinding.inflate(layoutInflater)
        val view = binding.root
        val layoutManager = RelativeLayout(this)
        val image = ImageView(this)

        layoutManager.removeView(image)

        setContentView(view)

        val progressBar: ProgressBar = findViewById(R.id.progress)
        val doubleBounce: Sprite = DoubleBounce()
        progressBar.indeterminateDrawable = doubleBounce
        progressBar.isVisible

        val meter:Chronometer = findViewById(R.id.meter)

        val startTimer: ImageButton = findViewById(R.id.start_timer)

        var isWorking = false

        startTimer.setOnClickListener(View.OnClickListener{

            if (!isWorking) {

                meter.start()

                isWorking = true

            } else {

                meter.stop()

                isWorking = false

            }

        })

    }}

