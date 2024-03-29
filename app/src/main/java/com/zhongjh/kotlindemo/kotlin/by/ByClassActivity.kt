package com.zhongjh.kotlindemo.kotlin.by

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示类委托
 */
class ByClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        val b = BaseImpl(10)
        Derived(b).print() // 输出 10
    }

    // 创建接口
    interface Base {
        fun print()
    }

    // 实现此接口的被委托的类
    class BaseImpl(val x: Int) : Base {
        override fun print() { print(x) }
    }

    // 通过关键字 by 建立委托类
    class Derived(b: Base) : Base by b

}