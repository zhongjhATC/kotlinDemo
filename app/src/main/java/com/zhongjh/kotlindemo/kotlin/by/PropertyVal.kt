package com.zhongjh.kotlindemo.kotlin.by

import kotlin.reflect.KProperty

/**
 * 属性类
 * @author zhongjh
 * @date 2021/11/9
 */
class PropertyVal {
    val p: String by DelegateVal()
}

// 委托的类
class DelegateVal {
    operator fun getValue(propertyVal: PropertyVal, property: KProperty<*>): String {
        return ""
    }
}