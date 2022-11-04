package com.example.viewpagerswipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        var handler = Handler()
        val sharedPreference = getSharedPreferences("other", 0)
        val a = sharedPreference.getString("intro","")
        handler.postDelayed({

            if (a.isNullOrBlank()){
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else {
                var intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }

        },1000)
    }
}