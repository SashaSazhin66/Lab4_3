package com.work.lab4_3

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_main.*

class TabFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            constraintLayout.setBackgroundColor(it.getInt(ARG_COLOR))
            image.setImageResource(it.getInt(ARG_RES))
        }
    }

    companion object {
        const val ARG_RES = "ARG_RES"
        const val ARG_COLOR = "ARG_COLOR"
        fun newInstance(imgRes: Int, color: Int): TabFragment {
            return TabFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_RES, imgRes)
                    putInt(ARG_COLOR, color)
                }
            }
        }
    }
}