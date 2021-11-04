package com.zhongjh.kotlindemo.kotlin.objectexpressionstatement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示对象表达类
 */
class ObjectExpressionActivity : AppCompatActivity() {

    val cc: A = object : A(1), B {
        override val y = 15
    }

    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
        val y: String = "y"
    }

    // 这个跟上一个是差不多一样的哦
    private val foo = object {
        val x: String = "x"
        val y: String = "y"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        // 其实这个就是对象表达的一种
        btnOperator.setOnClickListener {
            main()
            clickCount++;
        }
    }

    fun main() {
        val site = object {
            var name: String = "zhongjh"
            var gender: String = "男"
        }
        println(site.name)
        println(site.gender)

        val x1 = foo().x        // 没问题
        val y1 = foo().y        // 没问题
        val x2 = publicFoo()  // val x2 = publicFoo().x 错误：未能解析的引用“x”
        val x3 = foo.x
    }

}