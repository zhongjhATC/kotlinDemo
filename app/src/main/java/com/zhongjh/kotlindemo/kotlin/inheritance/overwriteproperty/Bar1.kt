package com.zhongjh.kotlindemo.kotlin.inheritance.overwriteproperty

class Bar1 : Foo() {

    override var x: Int = 0
        get() = field + 1
}