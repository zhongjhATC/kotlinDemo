package com.zhongjh.kotlindemo.kotlin.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示枚举类
 */
class WildCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enum)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val a = null
        test1(a)
    }

    fun test1(value : Int?) {
        var value2 = value
    }

}