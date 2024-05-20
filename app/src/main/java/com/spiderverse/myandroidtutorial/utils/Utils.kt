package com.spiderverse.myandroidtutorial.utils

import android.view.View
import android.widget.TextView

object Utils {

    fun setText(textView: TextView, str: String?) {
        textView.let { view ->
            view.visibility = View.VISIBLE
            view.text = str
        }
    }
}