package com.example.viewpagerswipe

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class HomeFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val viewview = inflater.inflate(R.layout.fragment_home, container, false)
        val currenttime = LocalDateTime.now();
        val date = currenttime.dayOfMonth.toInt()
        val month = currenttime.monthValue.toInt()
        viewview.findViewById<TextView>(R.id.today).text = "${month}월 ${date}일의 오늘의 평가"

        return viewview
    }

}