package com.zhongjh.kotlindemo.kotlin.kotlinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_nest.*

/**
 * 嵌套类
 */
class NestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nest)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val value = NestedClass.Nested().foot()
        tvContent.append(value.toString())
    }

}
