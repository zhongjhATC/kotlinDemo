package com.zhongjh.kotlindemo.kotlin.expand.emember2

class C1 : C() {

    override fun D.foo(): String {
        return "D.foo in C1"
    }

    override fun D1.foo(): String {
        return "D1.foo in C1"
    }
}