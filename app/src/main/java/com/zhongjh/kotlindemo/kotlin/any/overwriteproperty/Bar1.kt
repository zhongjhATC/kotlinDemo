package com.zhongjh.kotlindemo.kotlin.any.overwriteproperty

class Bar1 : Foo() {

    override val x: Int
        get() {
            return x + 1
        }
}