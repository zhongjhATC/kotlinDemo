package com.zhongjh.kotlindemo.kotlin.by

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示延迟属性 Lazy委托
 */
class LazyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        println(lazyValue)
        println(lazyValue)
    }

    val lazyValue: String by lazy {
        // 第一次调用输出，第二次调用不执行
        var helloZhongJH = "Hello"
        helloZhongJH += " zhongjh"
        Log.d("ByLazyActivity",helloZhongJH)
        helloZhongJH
    }

}