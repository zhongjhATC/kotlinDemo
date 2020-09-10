package com.zhongjh.kotlindemo.kotlin.kotlininterface.kotilininterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_kotilin_interface.*

class KotlinInterfaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotilin_interface)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val child = Child()
        tvContent.append(child.foo().toString() + "\n")
        tvContent.append(child.bar().toString() + "\n")
        tvContent.append(child.name)
    }

}