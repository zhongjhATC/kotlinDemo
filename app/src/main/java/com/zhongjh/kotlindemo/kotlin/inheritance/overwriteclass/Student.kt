package com.zhongjh.kotlindemo.kotlin.inheritance.overwriteclass

/**
 * 子类继承Person
 */
class Student : Person() {

    /**
     * 重写方法
     */
    override fun study(): Int {
        return 2
    }
}