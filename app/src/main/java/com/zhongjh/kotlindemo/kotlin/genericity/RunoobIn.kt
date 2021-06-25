package com.zhongjh.kotlindemo.kotlin.genericity

/**
 * @author 8
 * @date 2021/6/25
 * 定义一个支持逆变的类
 */
class RunoobIn<in A>(a: A) {
    fun foo(a: A) {
    }
}
