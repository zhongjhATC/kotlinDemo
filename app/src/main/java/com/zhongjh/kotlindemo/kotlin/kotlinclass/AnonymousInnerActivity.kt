package com.zhongjh.kotlindemo.kotlin.kotlinclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_anonymous_inner.*
import java.lang.reflect.Modifier

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
        val anonymousInnerClass = AnonymousInnerClass()
        // 特别注意这里的 object : TestInterFace，这个 object 是 Kotlin 的关键字，要实现匿名内部类，就必须使用 object 关键字，不能随意替换其它单词，切记切记。
        anonymousInnerClass.setInterFace(object : AnonymousInnerI{
            override fun test() {
                tvContent.append("匿名内部类")
            }
        })
    }

}