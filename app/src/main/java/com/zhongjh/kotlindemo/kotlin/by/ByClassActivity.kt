package com.zhongjh.kotlindemo.kotlin.by

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示类委托
 */
class ByClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
    }


}