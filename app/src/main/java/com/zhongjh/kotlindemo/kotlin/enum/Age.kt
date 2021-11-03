package com.zhongjh.kotlindemo.kotlin.enum

/**
 * 每一个枚举都是枚举类的实例，它们可以被初始化：
 *
 * @author zhongjh
 * @date 2021/11/3
 */
enum class Age(val rgb: Int, val number: Int) {

    Child(2, 20),
    Youth(18, 180),
    OldMan(60, 600)

}