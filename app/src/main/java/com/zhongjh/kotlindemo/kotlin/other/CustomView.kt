package com.zhongjh.kotlindemo.kotlin.other

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout

/**
 * 这是自定义view时如何利用init等函数初始化
 * @author zhongjh
 * @date 2021/12/14
 */
// 主级函数
class CustomView(context: Context, attrs: AttributeSet?) :
    FrameLayout(context, attrs) {

    // 次级函数
    constructor(context: Context) : this(context, null)

    init {
        Log.d("CustomView",attrs.toString())
    }

}