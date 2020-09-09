package com.zhongjh.kotlindemo.kotlin.any.overwriteproperty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_overwrite_property.*

class OverwritePropertyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overwrite_property)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val bar1 = Bar1()
        tvContent.append(bar1.x.toString())
    }

}