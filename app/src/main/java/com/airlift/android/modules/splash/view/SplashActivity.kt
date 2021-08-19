package com.airlift.android.modules.splash.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.airlift.android.R
import com.airlift.android.databinding.FragmentSplashBinding
import com.airlift.android.util.setTransparentStatusBar

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setTransparentStatusBar()

        binding = DataBindingUtil.setContentView(this, R.layout.fragment_splash)

        val intent = Intent(this, SplashActivity::class.java)

        Handler(Looper.getMainLooper()).postDelayed({
            //startActivity(intent)
        }, 3000)
    }
}