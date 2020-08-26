package com.zhongjh.kotlindemo.kotlin.datatype

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_compare.*

/**
 * 比较两个数字
 */
class CompareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compare)
        btnCompare.setOnClickListener { main() }
    }

    /**
     * 在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
     */
    @SuppressLint("SetTextI18n")
    fun main() {
        val a = 10000
        tvContent.append("a === a: " + (a === a)) // true，值相等，对象地址相等
        tvContent.append("\n");
        // 经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        // 虽然经过了装箱，但是值是相等的，都是10000
        tvContent.append("boxedA === anotherBoxedA: " + (boxedA === anotherBoxedA)) //  false，值相等，对象地址不一样
        tvContent.append("\n");
        tvContent.append("boxedA == anotherBoxedA: " + (boxedA == anotherBoxedA)) // true，值相等
    }

}