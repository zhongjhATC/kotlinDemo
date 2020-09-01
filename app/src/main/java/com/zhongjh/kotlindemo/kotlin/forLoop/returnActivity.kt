package com.zhongjh.kotlindemo.kotlin.forLoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_while.btnOperator
import kotlinx.android.synthetic.main.activity_while.tvContent

class returnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_return)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        for (i in 1..10) {
            if (i == 3) continue  // i 为 3 时跳过当前循环，继续下一次循环
            tvContent.setText(i.toString());
            if (i > 5) break   // i 为 6 时 跳出循环
        }

        // 标签式标记
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (j==2) {
                    tvContent.append(j.toString())
                    break@loop
                }
            }
        }

    }

}