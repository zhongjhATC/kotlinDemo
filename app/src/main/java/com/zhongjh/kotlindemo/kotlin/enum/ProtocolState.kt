package com.zhongjh.kotlindemo.kotlin.enum

/**
 * 枚举还支持以声明自己的匿名类及相应的方法、以及覆盖基类的方法。如：
 *
 * @author zhongjh
 * @date 2021/11/3
 */
enum class ProtocolState {
    WAITING {
        override fun signal() = "WAITING的方法"
    },
    TALKING {
        override fun signal() = "TALKING的方法"
    };

    abstract fun signal(): String
}