package com.genius.meditation

import android.content.Intent
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        GlobalScope.launch(Dispatchers.Main) {

                animateView()

                delay(1500)

                val intent = Intent(this@SplashActivity, InputActivity::class.java)

                startActivity(intent)

        }
    }


    private fun animateView() {
        val scaleAnimation = ScaleAnimation(
            1f, 3f, 1f, 3f, Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        scaleAnimation.duration = 1500

        val alphaAnimation = AlphaAnimation(1f, 0f)
        alphaAnimation.duration = 1500

        val animatorSet = AnimationSet(true)
        animatorSet.addAnimation(scaleAnimation)
        animatorSet.addAnimation(alphaAnimation)
        val image: ImageView = findViewById(R.id.image)
        image.startAnimation(animatorSet)

        animatorSet.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                image.alpha = 0f
            }

            override fun onAnimationStart(p0: Animation?) {

            }

        })
    }

}