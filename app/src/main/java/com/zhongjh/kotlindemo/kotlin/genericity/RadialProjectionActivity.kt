package com.zhongjh.kotlindemo.kotlin.genericity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_seal.*

/**
 *
 * @author 8
 * @date 2021/6/25
 * 星型投影
 */
class RadialProjectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val list = mutableListOf<String>()
        list.add("1")
        list.add("2")
        reportInfo(list)
    }

    fun reportInfo(info: MutableList<*>) {
        var test = Integer.valueOf(info[0].toString())
        test += 10
        tvContent.append(test.toString())
        tvContent.append("+")
        tvContent.append(info[1].toString())
    }

    fun reportInfoError(info: MutableList<*>) {
        // 这样是编译错误的
//        info.add("3")
    }

}