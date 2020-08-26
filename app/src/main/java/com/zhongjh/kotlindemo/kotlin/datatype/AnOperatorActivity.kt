package com.zhongjh.kotlindemo.kotlin.datatype

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_an_operator.*

/**
 * 位操作符
 */
class AnOperatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_an_operator)
        btnShl.setOnClickListener { main() }
    }

    @SuppressLint("SetTextI18n")
    fun main() {
        var a = 10;
        var aStr = Integer.toBinaryString(a)
        tvContent.append(aStr)
        tvContent.append("\n")
        var b = a shl 2
        tvContent.append("$aStr shl 2 : " + Integer.toBinaryString(b)) // 左移2位(Java’s <<)，预期结果
        tvContent.append("\n")

        var c = a shr 2
        tvContent.append("$aStr shl 2 : " + Integer.toBinaryString(c)) // 右移2位(Java’s >>)，预期结果
        tvContent.append("\n")

        var d = a ushr 2
        tvContent.append("$aStr ushr 2 : " + Integer.toBinaryString(d)) //  无符号右移位(Java’s >>>)，预期结果
        tvContent.append("\n")

        var e = a and b;
        tvContent.append("$aStr and " + Integer.toBinaryString(b) + " : " + Integer.toBinaryString(e)) //  无符号右移位(Java’s >>>)，预期结果
        tvContent.append("\n")

    }


}