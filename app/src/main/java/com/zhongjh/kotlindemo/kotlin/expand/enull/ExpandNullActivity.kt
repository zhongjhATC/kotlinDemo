package com.zhongjh.kotlindemo.kotlin.expand.enull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_null.*

fun Any?.toString() : String {
    if (this == null)
    // 如果对象为null,就不报错了返回的是“null”
        return "null"
    // 不为null则是返回自身文本
    return toString()
}

class ExpandNullActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_null)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val t = null
        tvContent.append(t.toString())
    }

}