package com.zhongjh.kotlindemo.kotlin.forLoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_for.*
import kotlinx.android.synthetic.main.activity_while.btnOperator
import kotlinx.android.synthetic.main.activity_while.tvContent

class ReturnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_return)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        var a = "asdfdsf";
        var i = a.toInt();

//        tvContent.append("\n(不使用标签)：")
//        for (i in 1..10) {
//            if (i == 3) continue  // i 为 3 时跳过当前循环，继续下一次循环
//            tvContent.append(i.toString())
//            if (i > 5) break   // i 为 6 时 跳出循环
//        }
//
//        // 标签式标记,@loop结束后就返回对应的@loop
//        tvContent.append("\n(loop标签1)：")
//        loop@ for (i in 1..5) {
//            for (j in 1..100) {
//                if (j == 2) {
//                    tvContent.append(j.toString())
//                    break@loop
//                }
//            }
//        }
//
//        // 两者区别，这个是回到第二层的循环里面
//        tvContent.append("\n(loop标签2)：")
//        for (i in 1..5) {
//            loop@ for (j in 1..100) {
//                if (j == 2) {
//                    tvContent.append(j.toString())
//                    break@loop
//                }
//            }
//        }
//
//        foo1()
//
//        foo2()
//
//        foo3()
//
//        foo4()
    }

    /**
     * 不用标签的方式
     */
    fun foo1() {
        tvContent.append("\n(讲解标签3)：");
        val ints = arrayOf(0, 1, 2, 3, 4, 5);
        ints.forEach {
            if (it == 0)
                return
            tvContent.append(it.toString())
        }
    }

    /**
     * 这个lit@标签只是返回forEach内部，并不是完全断绝了forEach
     */
    fun foo2() {
        tvContent.append("\n(讲解不同的标签3)：");
        val ints2 = arrayOf(0, 1, 2, 3, 4, 5);
        ints2.forEach lit@{
            if (it == 0)
                return@lit
            tvContent.append(it.toString())
        }
    }

    /**
     * 该匿名函数能完成跟foo2一样的效果
     */
    fun foo3() {
        tvContent.append("\n(讲解匿名函数)：");
        val ints = arrayOf(0, 1, 2, 3, 4, 5);
        ints.forEach(
            fun(value: Int) {
                if (value == 0) return
                tvContent.append(value.toString())
            }
        )
    }

    /**
     * 跟forEach函数相同则是隐式函数
     */
    fun foo4() {
        val ints = arrayOf(0, 1, 2, 3, 4, 5);
        ints.forEach {
            if (it == 0) return@forEach
            print(it)
        }
    }


}