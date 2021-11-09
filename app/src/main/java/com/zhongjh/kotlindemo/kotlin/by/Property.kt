package com.zhongjh.kotlindemo.kotlin.by

import kotlin.reflect.KProperty

/**
 * 属性类
 * @author zhongjh
 * @date 2021/11/9
 */
class Property {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(property1: Property, property: KProperty<*>): String {
        return "$property1, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(property1: Property, property: KProperty<*>, s: String) {
        println("$property1 的 ${property.name} 属性赋值为 $s")
    }
}