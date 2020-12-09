package com.zhongjh.kotlindemo.kotlin.genericity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_seal.*

class GenericConstraintActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_constraint)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {

    }


}