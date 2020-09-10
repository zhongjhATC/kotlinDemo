package com.zhongjh.kotlindemo.kotlin.kotlininterface.funoverwrite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_fun_overwrite.*

class FunOverwriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_overwrite)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val c = C()
        val d = D()
        tvContent.append(c.bar() + "\n")
        tvContent.append(c.foo() + "\n")
        tvContent.append(d.bar() + "\n")
        tvContent.append(d.foo() + "\n")
    }

}