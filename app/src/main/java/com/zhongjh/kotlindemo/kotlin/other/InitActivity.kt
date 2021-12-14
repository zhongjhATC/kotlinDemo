package com.zhongjh.kotlindemo.kotlin.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示init
 */
class InitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
    }


}