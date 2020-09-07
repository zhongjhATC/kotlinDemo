package com.zhongjh.kotlindemo.kotlin.any.overwriteclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_overwrite.*

/**
 * 重写类的演示
 */
class OverwriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overwrite)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val student = Student()
        val teacher = Teacher();
        tvContent.append("${student.study()}\n")
        tvContent.append("${teacher.study()}\n")
    }

}