package com.zhongjh.kotlindemo.kotlin.expand.eproperty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.any.overwriteproperty.Foo
import kotlinx.android.synthetic.main.activity_expand_property.*

val <T>MutableList<T>.lastIndex: Int
    get() = size - 1

val Foo.bar: Int
    get() = 1

/**
 * 扩展属性
 */
class ExpandPropertyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_property)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        // 扩展属性
        val list: MutableList<Int> = ArrayList()
        list.add(0)
        list.add(1)
        list.add(2)
        tvContent.append(list.lastIndex.toString())
    }

}