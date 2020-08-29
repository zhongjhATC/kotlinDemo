package com.zhongjh.kotlindemo.kotlin.forLoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_for.*

class ForActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for)
    }

    fun main() {
        val ints = arrayOf(1, 2, 3)
        // 可以普通循环
        for (item: Int in ints) {
            tvContent.append(item.toString())
        }
        tvContent.append("\n")

        // 通过索引遍历一个数组
        for (i in ints.indices) {
            tvContent.append(ints[i].toString())
        }
        tvContent.append("\n")

        // 注意不会创建额外对象
        for ((index, value) in ints.withIndex()) {
            println("the element at $index is $value")
        }

    }

}