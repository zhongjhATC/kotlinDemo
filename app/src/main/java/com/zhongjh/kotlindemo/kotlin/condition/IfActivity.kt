package com.zhongjh.kotlindemo.kotlin.condition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_if.*

class IfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if)
        btnOperation.setOnClickListener { main() }
    }

    fun main() {
        val a = 5
        val b = 10
        // 传统用法
        var max = a
        if (a < b)
            max = b

        // 使用else
        if (a > b) {
            max = a
        } else {
            max = b
        }

        // 作为表达式
        max = if (a > b)
            a
        else
            b
        tvContent.setText(max)
    }

}