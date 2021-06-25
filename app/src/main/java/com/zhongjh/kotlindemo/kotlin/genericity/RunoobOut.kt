package com.zhongjh.kotlindemo.kotlin.genericity

/**
 * 定义一个支持协变的类
 */
class RunoobOut<out A>(val a: A) {

    fun foo(): A {
        return a
    }

}