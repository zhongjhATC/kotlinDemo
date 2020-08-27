package com.zhongjh.kotlindemo.kotlin.datatype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_char.*

/**
 * 字符
 */
class CharActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_char)
        btnChar.setOnClickListener { decimalDigitValue('9') }
    }

    fun decimalDigitValue(c: Char) {
//        if (c == 1) { // 错误：类型不兼容，编译不通过
//            // ……
//        }
        if (c !in '0'..'9') {
            tvContent.setText("不在范围之内")
        }
        tvContent.setText((c.toInt() - '0'.toInt()).toString()) // 显式转换为数字
    }

}