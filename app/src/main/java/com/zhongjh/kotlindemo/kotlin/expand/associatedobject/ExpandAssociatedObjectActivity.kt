package com.zhongjh.kotlindemo.kotlin.expand.associatedobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_associated_object.*

fun MyClass.Companion.foo(): String {
    return "伴随对象的扩展函数\n"
}

val MyClass.Companion.no: Int
    get() = 10

/**
 * 伴生对象的扩展
 */
class ExpandAssociatedObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_associated_object)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        tvContent.append("no:${MyClass.no}\n")
        tvContent.append(MyClass.foo())
    }

}