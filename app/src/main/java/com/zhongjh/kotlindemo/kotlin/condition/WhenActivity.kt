package com.zhongjh.kotlindemo.kotlin.condition

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_when.*


@SuppressLint("SetTextI18n")
class WhenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when)
        btnOperator.setOnClickListener { main() }
        btnIs.setOnClickListener { hasPrefix("prefix") }
        btnIf.setOnClickListener { mainIf(1) }
    }

    /**
     * when可以用in等等判断
     */
    fun main() {
        val validNumbers = arrayOf(11, 12, 15, 16, 17)

        val x = 1
        when (x) {
            1 ->
                tvContent.setText("x == 1")
            2 ->
                tvContent.setText("x == 2")
            3, 4 ->
                tvContent.setText("x == 3,4")
            in 5..10 ->
                tvContent.setText("x == 5..10")
            in validNumbers ->
                tvContent.setText("x in validNumbers")
            else -> {
                // 注意这个块
                tvContent.setText("x 不是 1 ，也不是 2")
            }
        }
    }

    /**
     * when也可以用is来判断
     */
    fun hasPrefix(x: Any) =
        when (x) {
            is String -> {
                x.startsWith("prefix")
                tvContent.setText("x startsWith prefix")
            }
            1 ->
                tvContent.setText("x == 1")
            else ->
                tvContent.setText("x else")
        }

    /**
     * when也可以代替if，布尔值类型
     */
    fun mainIf(x: Int) {
        when {
            x == 0 ->
                tvContent.setText("x == 0")
            x == 1 ->
                tvContent.setText("x == 1")
            else ->
                tvContent.setText("x else")
        }
    }

}