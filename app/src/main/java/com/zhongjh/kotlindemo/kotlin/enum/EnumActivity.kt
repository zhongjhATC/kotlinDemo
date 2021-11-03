package com.zhongjh.kotlindemo.kotlin.enum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 演示枚举类
 */
class EnumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enum)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val color: Color = Color.RED
        tvContent.append("color.name: ${color.name}\n")
        // ordinal没什么意义，只是个序号而已，不建议加入业务中
        tvContent.append("color.ordinal: ${color.ordinal}\n")
        tvContent.append("Color.valueOf(\"RED\"): ${Color.valueOf("RED")}\n")
        tvContent.append("Color.values().size: ${Color.values().size}\n\n")

        // 每一个枚举都是枚举类的实例,可以自定义属性
        tvContent.append("Age.Child: ${Age.Child}\n")
        tvContent.append("Age.Child.rgb: ${Age.Child.rgb}\n")
        tvContent.append("Age.Child.number: ${Age.Child.number}\n\n")

        // 枚举还支持以声明自己的匿名类及相应的方法、以及覆盖基类的方法
        tvContent.append("ProtocolState.TALKING.signal(): ${ProtocolState.TALKING.signal()}\n\n")


    }

}