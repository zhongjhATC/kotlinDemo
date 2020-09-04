package com.zhongjh.kotlindemo.kotlin.kotlinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_person.*

class PersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val person = Person("zhong")
        tvContent.append("lastName: ${person.lastName}\n")
        person.lastName = "zhongjh"
        tvContent.append("lastName: ${person.lastName}\n")
        person.no = 9
        tvContent.append("no: ${person.no}\n")
        person.no = 20
        tvContent.append("no: ${person.no}\n")

        val person2 = Person("zhong", 5)
        tvContent.append("次构造函数: ${person2.no}\n")
    }


}