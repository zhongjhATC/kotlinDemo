package com.zhongjh.kotlindemo.kotlin.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_section.*

class SectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section)
        btnMain.setOnClickListener { main() }
    }

    fun main() {
        // 输出“1234”
        tvContent.append("输出1234:")
        for (i in 1..4)
            tvContent.append(i.toString()) // 输出“1234”
        tvContent.append("\n")

        // 设置步长距离
        tvContent.append("设置步长距离为2:")
        for (i in 1..4 step 2)
            tvContent.append(i.toString()) // 输出“13”
        tvContent.append("\n")

        tvContent.append("如果想倒序遍历就该使用标准库中定义的downTo()函数,步长距离为2：")
        for (i in 4 downTo 1 step 2)
            tvContent.append(i.toString()) // 输出“42”

        tvContent.append("\n")
        tvContent.append("使用 until 函数排除结束元素：")
        for (i in 1 until 4) {
            tvContent.append(i.toString()) // 输出“123” i in [1, 4) 排除了 4
        }
    }

}