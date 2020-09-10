package com.zhongjh.kotlindemo.kotlin.kotlininterface.kotilininterface

interface MyInterface {

    var name:String // name 属性, 抽象的

    /**
     * 未实现的方法
     */
    fun bar() : Int

    /**
     * 已实现的方法
     */
    fun foo(): Int {
        return 1
    }

}