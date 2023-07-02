package com.example.a36_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_1,TitleFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_2,SongsFragment()).commit()

    }
}