package com.fernandoapeguero.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener(){
        val clicableViews: List<View> =
                listOf(box_one_text,box_two_text , box_three_text,
                        box_four_text, box_five_text,constrain_layout,
                    button_red , button_green , button_yellow)


        for(item in clicableViews){

            item.setOnClickListener { makeColored(it) }

        }

    }


    fun makeColored(view: View){

        when(view.id){

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button_red -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.button_green -> box_four_text.setBackgroundResource(R.color.my_green)
            R.id.button_yellow -> box_five_text.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }
}
