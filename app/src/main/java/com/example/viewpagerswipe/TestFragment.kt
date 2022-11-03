package com.example.viewpagerswipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment(private val image: Int,private val text: String, private val text2: String) : Fragment() {
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
        imageView.setImageResource(image!!)
        textView.text = text
        textView2.text = text2
        button = view.findViewById(R.id.bt_onboard_finish)
        if(image == R.drawable.startu) {
            button.visibility = View.INVISIBLE
        }
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