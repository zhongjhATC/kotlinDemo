package com.zhongjh.kotlindemo.kotlin.genericity

class RunoobOut<out A>(val a: A) {

    fun foo(): A {
        return a
    }

}