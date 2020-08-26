package com.zhongjh.kotlindemo.kotlin.grammar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_character.*

@SuppressLint("SetTextI18n")
class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)
        btnSimple.setOnClickListener { simple() }
        btnComplex.setOnClickListener { complex() }
    }

    /**
     * 模板中的简单名称
     */
    fun simple() {
        val a = 1
        val s1 = "a is $a"
        tvContent.setText(s1)
    }

    /**
     * 模板中的任意表达式：
     */
    fun complex() {
        val a = 2
        val s1 = "a is $a"
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        tvContent.setText(s2)
    }

}