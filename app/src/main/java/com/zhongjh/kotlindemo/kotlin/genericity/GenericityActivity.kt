package com.zhongjh.kotlindemo.kotlin.genericity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.dataclass.eval
import kotlinx.android.synthetic.main.activity_seal.*

/**
 * 泛型声明
 */
class GenericityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genericity)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        var boxInt = Box(10)
        var boxString = Box("Runoob")
        tvContent.append(boxInt.value.toString())
        tvContent.append("\n")
        tvContent.append(boxString.value)
        tvContent.append("\n")
    }

}