package com.genius.meditation

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.genius.meditation.databinding.TabBinding
import com.google.android.material.tabs.TabLayoutMediator
import android.view.View
import android.widget.ImageButton
import com.genius.meditation.adapter.ViewPagerAdapter

class TabActivity : AppCompatActivity() {

    val titles = arrayOf(
        "Morning meditation",
        "Daytime 5 min meditation",
        "Meditation before sleep"
    )

    private lateinit var binding: TabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TabBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val next: ImageButton = findViewById(R.id.next)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            tab.icon = resources.getDrawable(R.drawable.img_12)

        }.attach()

        next.setOnLongClickListener(View.OnLongClickListener {

            next.background=getDrawable(R.drawable.orange)

            val tabPosition = tabLayout.selectedTabPosition

            if (tabPosition == 0) {

                val intent: Intent = Intent(this@TabActivity, About1Activity::class.java)

                startActivity(intent)
            }


            if (tabPosition == 1) {

                val intent: Intent = Intent(this@TabActivity, About2Activity::class.java)

                startActivity(intent)
            }

            if (tabPosition == 2) {

                val intent: Intent = Intent(this@TabActivity, About3Activity::class.java)

                startActivity(intent)

            }

            return@OnLongClickListener true

        })


    }


}
