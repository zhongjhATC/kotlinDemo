package com.zhongjh.kotlindemo.kotlin.kotlinclass

import java.util.*

class Person constructor(val firstName: String) {

    constructor(firstName: String, no: Int) : this(firstName) {
    }

    var lastName: String = firstName
        get() = field.toUpperCase(Locale.getDefault()) // 变量赋值后转换大写

    var no: Int = 100
        set(value) {
            if (value < 10)
                field = value // 如果传入的值小于 10 返回该值
            else
                field = -1 // 如果传入的值大于等于 10 返回 -1
        }

    lateinit var str: String

}