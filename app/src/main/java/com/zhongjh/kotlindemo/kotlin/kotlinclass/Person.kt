package com.zhongjh.kotlindemo.kotlin.kotlinclass

import java.util.*

class Person {

    class Person(firstName: String) {

    }

    var lastName: String = "zhong"
        get() = field.toUpperCase(Locale.getDefault()) // 变量赋值后转换大写

    var no: Int = 100
        set(value) {
            if (value < 10)
                field = value
            else
                field = -1
        }

}