package com.zhongjh.kotlindemo.kotlin.any.overwriteclass

/**
 * 如果有多个相同的方法（继承或者实现自其他类，如A、B类），则必须要重写该方法，使用super范型去选择性地调用父类的实现。
 */
class Teacher : Person(),StudyInterface {

    override fun study(): Int {
//        return super<Person>.study()
        return super<StudyInterface>.study()
    }
}