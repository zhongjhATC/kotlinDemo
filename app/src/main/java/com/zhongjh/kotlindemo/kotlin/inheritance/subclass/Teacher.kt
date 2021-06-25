package com.zhongjh.kotlindemo.kotlin.inheritance.subclass

/**
 * 如果子类没有主构造函数，则必须在每一个二级构造函数中用super关键字初始化基类，或者在代理另一个构造函数。
 * 初始化基类时，可以调用基类的不同构造方法
 */
class Teacher : Person {

    constructor(name: String, age: Int, no: String, score: Int) : super(name, age) {

    }

}