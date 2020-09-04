package com.zhongjh.kotlindemo.kotlin.kotlinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_inner.*

class InnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val inner = InnerClass().Inner()
        val foo = inner.foo()
        tvContent.append("foor:${foo}\n")
        val bar = inner.innerTest()
        tvContent.append("bar:${bar}\n")
    }

}