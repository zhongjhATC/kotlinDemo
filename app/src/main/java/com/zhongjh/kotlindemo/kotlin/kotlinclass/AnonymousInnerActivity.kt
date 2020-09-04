package com.zhongjh.kotlindemo.kotlin.kotlinclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_anonymous_inner.*

/**
 * 匿名内部类
 */
class AnonymousInnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anonymous_inner)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        var anonymousInnerClass = AnonymousInnerClass()
        anonymousInnerClass.setInterFace(object : AnonymousInnerI{
            override fun test() {
                tvContent.append("匿名内部类")
            }
        })


    }

}