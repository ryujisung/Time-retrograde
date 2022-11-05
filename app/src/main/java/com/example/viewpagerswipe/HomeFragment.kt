package com.example.viewpagerswipe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*
import java.time.LocalDateTime

class HomeFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val viewview = inflater.inflate(R.layout.fragment_home, container, false)
        val currenttime = LocalDateTime.now();
        var score = 0;
        val date = currenttime.dayOfMonth.toInt()
        val month = currenttime.monthValue.toInt()
        viewview.findViewById<TextView>(R.id.today).text = "${month}월 ${date}일의 오늘의 평가"
        viewview.findViewById<Button>(R.id.assesment).setOnClickListener {
            if(viewview.findViewById<CheckBox>(R.id.first_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.second_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.third_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.fourth_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.fiveth_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.sixth_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.seventh_checkbox).isChecked)
                score += 1;
            if(viewview.findViewById<CheckBox>(R.id.eighth_checkbox).isChecked)
                score += 1
            (activity as MainActivity2).changeFragment(2,score)
        }

        return viewview
    }

}