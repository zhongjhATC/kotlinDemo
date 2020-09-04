package com.zhongjh.kotlindemo.kotlin.kotlinclass

/**
 * 演示匿名内部类
 */
class AnonymousInnerClass {

    var v = "成员属性"
    fun setInterFace(anonymousInnerI: AnonymousInnerI) {
        anonymousInnerI.test()
    }

}

