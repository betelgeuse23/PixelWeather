package com.example.pixelweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pixelweather.fragments.MainFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main)
        supportFragmentManager.beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}