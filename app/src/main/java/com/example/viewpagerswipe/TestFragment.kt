package com.example.viewpagerswipe

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment(private val image: Int,private val text: String, private val text2: String, private val truefalse: Boolean) : Fragment() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.bt_onboard_finish).setOnClickListener{
            val mainintent = Intent(context,MainActivity2::class.java)
            startActivity(mainintent)
        }
        imageView.setImageResource(image!!)
        textView.text = text
        textView2.text = text2
        button = view.findViewById(R.id.bt_onboard_finish)
        if(image == R.drawable.startu) {
            button.visibility = View.INVISIBLE
        }
        if(truefalse){
            button.visibility =  View.VISIBLE
        }
    }

    fun getSharedPreferences(name: String?, mode: Int): SharedPreferences? {
        throw RuntimeException("Stub!")
    }

    companion object {
//        fun newInstance(image: Int, text: String, text2: String): Fragment {
//            if (image == R.drawable.startu) {
//
//            }
//            return TestFragment().apply {
//                arguments = Bundle().apply {
//                    putInt("image", image)
//                    putString("text", text)
//                    putString("text2", text2)
//                }
//
//            }
//        }
    }
}