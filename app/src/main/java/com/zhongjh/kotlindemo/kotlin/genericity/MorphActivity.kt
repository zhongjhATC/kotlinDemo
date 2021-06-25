package com.zhongjh.kotlindemo.kotlin.genericity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_seal.*

/**
 * 型变
 */
class MorphActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morph)
        btnOperator.setOnClickListener { mainOut() }
    }


    /**
     * 声明处型变:out
     */
    fun mainOut() {
        var strCo: RunoobOut<String> = RunoobOut("a")
        var anyCo: RunoobOut<Any> = RunoobOut<Any>("b")
        anyCo = strCo
        tvContent.text = ""
        // 输出a
        tvContent.append(anyCo.foo())
    }

    /**
     * 声明处型变:In
     */
    fun mainIn() {
        var strCo = RunoobIn("a")
        var anyCo = RunoobIn<Any>("b")
        strCo = anyCo
    }



}