package com.zhongjh.kotlindemo.kotlin.inheritance.subclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_subclass.*

/**
 * 类的构造函数
 */
class SubclassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subclass)
        btnOperator.setOnClickListener { main() }
    }

    private fun main() {
        val student = Student(
            "zhongjh",
            18,
            "4408231",
            98
        )
        tvContent.append("学生名:${student.name}\n")
        tvContent.append("年龄:${student.age}\n")
        tvContent.append("学生号:${student.no}\n")
        tvContent.append("成绩:${student.score}\n")
        val Teacher = Teacher(
            "zhongjhTeacher",
            18,
            "4408231990",
            97
        )
        tvContent.append("老师名:${student.name}\n")
        tvContent.append("年龄:${student.age}\n")
        tvContent.append("工号:${student.no}\n")
        tvContent.append("成绩:${student.score}\n")
    }

}