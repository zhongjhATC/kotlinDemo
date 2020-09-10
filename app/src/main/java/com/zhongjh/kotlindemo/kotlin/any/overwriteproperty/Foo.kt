package com.zhongjh.kotlindemo.kotlin.any.overwriteproperty

open class Foo {
    open val x: Int = 0
        get() = field
}