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


class assesmentFragment(private val score: Int) : Fragment() {

    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewview = inflater.inflate(R.layout.fragment_assesment, container, false)
        val currenttime = LocalDateTime.now();
        val date = currenttime.dayOfMonth.toInt()
        val month = currenttime.monthValue.toInt()
        viewview.findViewById<TextView>(R.id.today).text = "${month}월 ${date}일의 오늘의 평가"
        when(score){
            0 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "0점...?\n" + "지속가능한 발전을 위해 환경을 생각하는 내일을 만듭시다\n" + "（＞人＜；)"
            1 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "12.5점!\n" + "조금 더 환경을 생각해주세요!\n" + "（；´д｀）ゞ"
            2 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "25점!\n" + "힘내세요! 거의 다왔어요!\n" + "ヽ(*。>Д<)o゜"
            3 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "37.5점!\n" + "내일은 좀 더 나아지겟죠?\n" + "(っ °Д °;)っ"
            4 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "50점!\n" + "50점을 넘었네요 축하해요!\n" + "（￣︶￣）↗　"
            5 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "62.5점!\n" + "진짜 거의 다 왔어요!\n" + "╰(*°▽°*)╯"
            6 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "75점!\n" + "진짜진짜 조금 남았어요!\n" + "q(≧▽≦q)"
            7 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "87.5점!\n" + "조금만더 화이팅!\n" + "(～￣▽￣)～"
            8 -> viewview.findViewById<TextView>(R.id.textview_txt).text = "100점\n" + "100점이라니 완벽해요!\n" + "☆*: .｡. o(≧▽≦)o .｡.:*☆"
        }
        return viewview
    }
}