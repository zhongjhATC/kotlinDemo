package com.zhongjh.kotlindemo.kotlin.by

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示属性委托
 */
class ByPropertyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        val e = Property()
        println(e.p)     // 访问该属性，调用 getValue() 函数

        e.p = "Runoob"   // 调用 setValue() 函数
        println(e.p)
    }

}