package com.zhongjh.kotlindemo.kotlin.datatype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_character_string.*

class CharacterStringActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_string)
        btnCharacterString.setOnClickListener { main() }
    }

    fun main() {
        val text = """
多行字符串
    多行字符串
    """
        // 输出有一些前置空格
        tvContent.append(text)

        // 默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
        val text2 = """
    |多行字符串
    |菜鸟教程
    |  多行字符串
    |Runoob
    """.trimMargin()
        // 前置空格删除了
        tvContent.append(text2)

    }

}