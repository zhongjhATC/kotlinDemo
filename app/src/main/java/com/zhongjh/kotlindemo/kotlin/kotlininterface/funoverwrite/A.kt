package com.zhongjh.kotlindemo.kotlin.kotlininterface.funoverwrite

interface A {

    // 已实现
    fun foo(): String {
        return "A:foo"
    }

    // 未实现，没有方法体，是抽象的
    fun bar(): String
}