package com.zhongjh.kotlindemo.kotlin.genericity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_seal.*

/**
 * 泛型判断类型
 */
class GenericityWhenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genericity_when)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val age = 23
        val name = "runoob"
        val bool = true

        doPrintln(age)
        doPrintln(name)
        doPrintln(bool)
    }

    fun <T> doPrintln(content: T) {
        when (content) {
            is Int -> {
                tvContent.append("整型数字为 $content")
                tvContent.append("\n")
            }
            is String -> {
                tvContent.append("字符串转换为大写：${content.toUpperCase()}")
                tvContent.append("\n")
            }
            else -> {
                tvContent.append("T 不是整型，也不是字符串")
                tvContent.append("\n")
            }
        }
    }

}