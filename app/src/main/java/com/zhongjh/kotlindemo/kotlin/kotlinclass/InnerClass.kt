package com.zhongjh.kotlindemo.kotlin.kotlinclass

/**
 * 演示内部类
 */
class InnerClass {

    private val bar: Int = 1
    var v = "成员属性"

    /**
     * 嵌套内部类
     **/
    inner class Inner {

        fun foo() = bar  // 访问外部类成员

        fun innerTest(): Int {
            val o = this@InnerClass // 获取外部类的成员变量
            return o.bar
        }
    }

}