package com.zhongjh.kotlindemo.kotlin.forLoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_while.*

class WhileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_while)
    }

    fun main(args: Array<String>) {
        tvContent.append("----while 使用-----")
        tvContent.append("\n")
        var x = 5
        while (x > 0) {
            tvContent.append(x--.toString())
        }
        tvContent.append("----while 使用-----")
        tvContent.append("\n")
        var y = 5
        do {
            tvContent.append(y--.toString())
        } while(y>0)
    }

}