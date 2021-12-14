package com.zhongjh.kotlindemo.kotlin.other

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout

/**
 * 这是自定义view时如何利用init等函数初始化
 * 写法按照传统的java形式自定义view
 * @author zhongjh
 * @date 2021/12/14
 */
class CustomView2 : FrameLayout {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        Log.d("CustomView2", "顺序2：constructor")
        initCustom(attrs)
    }

    init {
        Log.d("CustomView2", "顺序1：init")
    }

    private fun initCustom(attrs: AttributeSet?) {
        Log.d("CustomView2", "顺序3：initCustom" + attrs.toString())
    }

}