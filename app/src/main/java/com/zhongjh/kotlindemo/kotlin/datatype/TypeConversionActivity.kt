package com.zhongjh.kotlindemo.kotlin.datatype

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R

/**
 * 类型转换
 */
class TypeConversionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_conversion)
    }

    @SuppressLint("SetTextI18n")
    fun main() {
        val b: Byte = 1 // OK, 字面值是静态检测的
        val i: Int = b.toInt() // 错误
        val l = 1L + 3
    }

}