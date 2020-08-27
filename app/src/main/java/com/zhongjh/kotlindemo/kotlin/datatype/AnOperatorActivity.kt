package com.zhongjh.kotlindemo.kotlin.datatype

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_an_operator.*

/**
 * 位操作符
 * 关于位操作符详解可以看该链接 https://blog.csdn.net/liwenxia626/article/details/80789671
 * 基本解释就是：
 * 5转换为二进制：0000 0000 0000 0000 0000 0000 0000 0101
 * 3转换为二进制：0000 0000 0000 0000 0000 0000 0000 0011
 * and比较二级制：0000 0000 0000 0000 0000 0000 0000 0001 换算就是1
 */
class AnOperatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_an_operator)
        btnAnOperator.setOnClickListener { main() }
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
        tvContent.append(Integer.toBinaryString(a) + " and " + Integer.toBinaryString(a) + " : " + Integer.toBinaryString(e)) //  与运算符，相同则是1，不同则是0
        tvContent.append("\n")

        var f = a or b;
        tvContent.append(Integer.toBinaryString(a) + " and " + Integer.toBinaryString(a) + " : " + Integer.toBinaryString(f)) //  或运算符，只要有个是1，那么结果就是1，否则为0
        tvContent.append("\n")

        var g = a xor b;
        tvContent.append(Integer.toBinaryString(a) + " and " + Integer.toBinaryString(a) + " : " + Integer.toBinaryString(g)) //  异或运算符，相同则是0，不同则是1
        tvContent.append("\n")

        var h = a.inv();
        tvContent.append(Integer.toBinaryString(a) + ".inv() : " + Integer.toBinaryString(h)) //  反向运算符,即是将16进制所有反向改变
        tvContent.append("\n")
    }


}