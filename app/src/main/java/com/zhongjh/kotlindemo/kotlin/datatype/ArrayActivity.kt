package com.zhongjh.kotlindemo.kotlin.datatype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_array.*

class ArrayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)
        btnArray.setOnClickListener { main() }
    }

    fun main() {
        // [1,2,3]
        val a = arrayOf(1, 2, 3)
        // [0,2,4],创建数量3个，每次以2递增
        val b = Array(3, { i -> (i * 2) })

//        如上所述，[] 运算符代表调用成员函数 get() 和 set()。
//        注意: 与 Java 不同的是，Kotlin 中数组是不协变的（invariant）。
//        除了类Array，还有ByteArray, ShortArray, IntArray，用来表示各个类型的数组，省去了装箱操作，因此效率更高，其用法同Array一样：
        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]

        //  读取数组内容
        tvContent.append(a[0].toString())
        tvContent.append("\n")
        tvContent.append(b[1].toString())
        tvContent.append("\n")
        tvContent.append(x[0].toString())
    }

}