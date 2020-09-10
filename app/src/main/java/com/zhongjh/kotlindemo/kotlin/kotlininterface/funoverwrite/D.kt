package com.zhongjh.kotlindemo.kotlin.kotlininterface.funoverwrite

class D: A, B {

    override fun foo(): String {
        return super<A>.foo()
    }

    override fun bar(): String {
        return super.bar()
    }


}