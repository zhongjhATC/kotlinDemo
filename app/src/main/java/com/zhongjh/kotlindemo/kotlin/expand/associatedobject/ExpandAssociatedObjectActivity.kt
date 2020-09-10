package com.zhongjh.kotlindemo.kotlin.expand.associatedobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_associated_object.*

class ExpandAssociatedObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_associated_object)
        btnOperator.setOnClickListener { main() }
    }

    fun MyClass.Companion.foo() {
        tvContent.append("伴随对象的扩展函数\n")
    }

    val MyClass.Companion.no : Int
        get() = 10

    fun main() {
        tvContent.append("no:${MyClass.no}\n")
        MyClass.foo()
    }

}