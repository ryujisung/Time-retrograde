package com.example.viewpagerswipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var vpAdapter: FragmentStatePagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpAdapter = CustomPagerAdapter(supportFragmentManager)
        viewpager.adapter = vpAdapter

        indicator.setViewPager(viewpager)
    }

    class CustomPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val PAGENUMBER = 4

        override fun getCount(): Int {
            return PAGENUMBER
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> TestFragment.newInstance(R.drawable.cloc, "이젠 탄소 배출을 줄일시간","CO₂배출량(톤/GWh)은 1GWh 당 \n" +
                        "석탄 888톤, 석유 733톤, 천연가스 499톤입니다.\n" +
                        "그렇다면 우리나라는 얼마만큼 화석연료를 사용할까요?")
                1 -> TestFragment.newInstance(R.drawable.globalwarmin, "지구가 아파요....","지구온난화는 날이 갈수록 심해지고 있습니다.\n" +
                        "그렇다면 어떻게하면 해결할 수 있을까요?")
                2 -> TestFragment.newInstance(R.drawable.gear, "개인적인 차원에서 실천","“나하나인데?”라는 생각말고\n" +
                        "나부터 실천해봅시다")
                3 -> TestFragment.newInstance(R.drawable.startu, "그럼,\n" +
                        "시작해 볼까요?","“‘천리길도 한 걸음부터’라는 속담이 있어요.\n" +
                        "8가지의 간단한 탄소 배출량을 줄이는 방법이\n" +
                        "당신을 기다리고 있어요!")
                else -> TestFragment.newInstance(R.drawable.cloc, "이젠 탄소 배출을 줄일시간","CO₂배출량(톤/GWh)은 1GWh 당 \n" +
                        "석탄 888톤, 석유 733톤, 천연가스 499톤입니다.\n" +
                        "그렇다면 우리나라는 얼마만큼 화석연료를 사용할까요?")
            }
        }
    }
}