package com.zhongjh.kotlindemo.kotlin.inheritance.overwriteproperty

open class Foo {
    open val x: Int = 0
        get() = field
}