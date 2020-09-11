package com.zhongjh.kotlindemo.kotlin.expand.emember

class C {

    fun baz(): String {
        return "C baz\n"
    }

    // 与 D 类 的 bar 同名
    fun bar() : String {
        return "C bar\n"
    }

    fun D.foo(): String {
        // 调用 D.bar 和 C.baz
        return bar() + baz()
    }

    fun D.foo2() : String {
        return bar() + this@C.bar()
    }

    fun caller(d: D): String {
        return d.foo()   // 调用扩展函数
    }

    fun caller2(d: D) : String {
        return d.foo2()
    }

}