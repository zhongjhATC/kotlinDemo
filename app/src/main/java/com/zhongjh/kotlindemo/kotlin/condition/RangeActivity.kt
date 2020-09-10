package com.zhongjh.kotlindemo.kotlin.condition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_range.*

class RangeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_range)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val x = 5
        val y = 9
        if (x in 1..8) {
            tvContent.setText("在范围内")
        }
    }

}