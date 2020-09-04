package com.zhongjh.kotlindemo.kotlin.kotlinclass

/**
 * 嵌套类的演示
 */
class NestedClass { // 外部类

    private val bar : Int = 1

    class Nested { // 嵌套类
        fun foot() = 2
    }

}