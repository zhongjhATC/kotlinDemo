package com.zhongjh.kotlindemo.kotlin.dataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_an_operator.tvContent
import kotlinx.android.synthetic.main.activity_copy.*

class CopyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_copy)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        // (1).复制实例
        val jack = User(name = "Jack", age = 1)
        // 使用 copy 类复制 User 数据类，并修改 age 属性:
        val olderJack = jack.copy(age = 2)

        tvContent.append(jack.toString())
        tvContent.append("\n")
        tvContent.append(olderJack.toString())
        tvContent.append("\n")

        // (2).数据类以及解构声明
        val jane = User("Jane", 35)
        val (name, age) = jane // 组件函数允许数据类在解构声明中使用
        tvContent.append("$name, $age years of age")
        tvContent.append("\n")

        // (3).Pair和Triple
        val pair = Pair(1,2)
        val triple = Triple(1,2,3)
        tvContent.append("$pair \t $triple")
        tvContent.append("\n")
        tvContent.append(pair.toList())
        tvContent.append("\n")
        tvContent.append(triple.toList())
        tvContent.append("\n")
        tvContent.append(pair.to(3))


    }

}