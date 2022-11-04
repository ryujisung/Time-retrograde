package com.example.viewpagerswipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.*
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager = findViewById<ViewPager2>(R.id.viewpager)

        var vpAdapter: FragmentStateAdapter = CustomPagerAdapter(this)
        viewpager.adapter = vpAdapter

        findViewById<TextView>(R.id.btn_onboard_skip).setOnClickListener {

            val mainintent = Intent(this,MainActivity2::class.java)
            startActivity(mainintent)
        }

        indicator.setViewPager(viewpager)
    }

    class CustomPagerAdapter(fm: FragmentActivity): FragmentStateAdapter(fm) {

        override fun getItemCount(): Int {
            return 4
        }

        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> {
                    Log.e("visible","00000")
                    return TestFragment(
                        R.drawable.cloc, "이젠 탄소 배출을 줄일시간", "CO₂배출량(톤/GWh)은 1GWh 당 \n" +
                                "석탄 888톤, 석유 733톤, 천연가스 499톤입니다.\n" +
                                "그렇다면 우리나라는 얼마만큼 화석연료를 사용할까요?",false)
                }

                1 -> {
                    Log.e("visible","${position}")
                    return TestFragment(
                        R.drawable.globalwarmin, "지구가 아파요....", "지구온난화는 날이 갈수록 심해지고 있습니다.\n" +
                                "그렇다면 어떻게하면 해결할 수 있을까요?",false)
                }
                2 -> {
                    Log.e("visible","${position}")
                    return TestFragment(
                        R.drawable.gear, "개인적인 차원에서 실천", "“나하나인데?”라는 생각말고\n" +
                                "나부터 실천해봅시다"
                    ,false)
                }
                3 -> {
                    Log.e("visible","${position}")
                    return TestFragment(R.drawable.startu, "그럼,\n" +
                            "시작해 볼까요?","“‘천리길도 한 걸음부터’라는 속담이 있어요.\n" +
                            "8가지의 간단한 탄소 배출량을 줄이는 방법이\n" +
                            "당신을 기다리고 있어요!",true)
                }

                else -> {
                    return TestFragment(
                        R.drawable.cloc, "이젠 탄소 배출을 줄일시간", "CO₂배출량(톤/GWh)은 1GWh 당 \n" +
                                "석탄 888톤, 석유 733톤, 천연가스 499톤입니다.\n" +
                                "그렇다면 우리나라는 얼마만큼 화석연료를 사용할까요?"
                    ,false)
                }
            }
        }
    }
}