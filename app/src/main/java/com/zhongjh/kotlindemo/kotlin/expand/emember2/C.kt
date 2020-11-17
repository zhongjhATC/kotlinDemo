package com.zhongjh.kotlindemo.kotlin.expand.emember2

open class C {

    open fun D.foo() : String {
        return "D.foo in C"
    }

    open fun D1.foo() : String {
        return "D1.foo in C"
    }

    fun caller(d: D) : String {
        return d.foo()   // 调用传递过来的d扩展函数
    }

}