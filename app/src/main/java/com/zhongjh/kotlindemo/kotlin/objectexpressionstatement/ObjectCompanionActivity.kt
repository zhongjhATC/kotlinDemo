package com.zhongjh.kotlindemo.kotlin.objectexpressionstatement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示伴生对象
 */
class ObjectCompanionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        // 其实这个就是对象表达的一种
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        // 访问到对象的内部元素
        val instance = MyClass.create()
        val instance2 = MyClass2.Companion
    }

    class MyClass {
        companion object Factory {
            fun create(): MyClass = MyClass()
        }
    }

    class MyClass2 {
        companion object
    }

}