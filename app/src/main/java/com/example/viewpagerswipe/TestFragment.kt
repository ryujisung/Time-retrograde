package com.example.viewpagerswipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment : Fragment() {
    private var image: Int? = null
    private var text: String? = null
    private var text2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            image = it.getInt("image", 0)
            text = it.getString("text", "")
            text2 = it.getString("text2", "")
        }
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
    }

    companion object {
        fun newInstance(image: Int, text: String,text2:String) =
            TestFragment().apply {
                arguments = Bundle().apply {
                    putInt("image", image)
                    putString("text", text)
                    putString("text2",text2)
                }
            }
    }
}