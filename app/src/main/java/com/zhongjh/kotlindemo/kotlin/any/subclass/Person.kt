package com.zhongjh.kotlindemo.kotlin.any.subclass

/**
 * 基类
 */
open class Person(name: String) {

    /**
     * 次级构造函数
     */
    constructor(name: String, age: Int) : this(name) {

    }

    /**
     * 次级构造函数
     */
    constructor(name: String, age: Int, sex: Int) : this(name, age) {

    }

}
