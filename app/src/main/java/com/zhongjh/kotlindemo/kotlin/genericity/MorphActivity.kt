package com.zhongjh.kotlindemo.kotlin.genericity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_seal.*

class MorphActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morph)
        btnOperator.setOnClickListener { main() }
    }


    fun main() {
        var strCo: RunoobOut<String> = RunoobOut("a")

    }


}