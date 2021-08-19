package com.airlift.android.modules.base


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.airlift.android.R
import com.airlift.android.databinding.ActivityMainBinding
import com.airlift.android.util.setWhiteStatusBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setWhiteStatusBar()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }


}