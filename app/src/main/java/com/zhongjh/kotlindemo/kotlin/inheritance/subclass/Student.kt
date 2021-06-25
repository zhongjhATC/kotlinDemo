package com.zhongjh.kotlindemo.kotlin.inheritance.subclass

/**
 * 如果子类有主构造函数，则基类必须在主构造函数中立即初始化
 * 在父类基础上额外添加了两个属性：no,score
 * 子类继承父类时，不能有跟父类同名的变量，除非父类中该变量为 private，或者父类中该变量为 open 并且子类用 override 关键字重写:
 */
class Student(var name: String, var age: Int, var no: String, var score: Int) : Person(name, age) {


}