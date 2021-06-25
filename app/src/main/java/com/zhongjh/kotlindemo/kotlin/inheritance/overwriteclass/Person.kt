package com.zhongjh.kotlindemo.kotlin.inheritance.overwriteclass

/**
 * 用户基类
 * 在基类中，使用fun声明函数时，此函数默认为final修饰，不能被子类重写。
 * 如果允许子类重写该函数，那么就要手动添加open修饰它，子类重写方法使用override关键词
 */
open class Person {

    /**
     * 允许子类重写
     */
    open fun study(): Int {
        return 1
    }

}