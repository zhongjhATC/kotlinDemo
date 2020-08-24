package com.zhongjh.kotlindemo.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_null.*

class NullActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null)
        btnQuestionMark.setOnClickListener { questionMark() }
        btnDoubleExclamationMark.setOnClickListener { doubleExclamationMark() }
        btnQuestionMarksColon.setOnClickListener { questionMarksColon() }
    }

    /**
     * 不做处理返回 null
     */
    fun questionMark() {
        var age = null;
        val ages = age?.toInt()
        // 结果显示null
        tvContent.setText(ages.toString())
    }

    /**
     * 抛出空指针异常
     */
    fun doubleExclamationMark() {
        var age = null;
        // !!主动抛出异常
        try {
            val ages = age!!.toInt()
            tvContent.setText(ages.toString())
        } catch (e: Exception) {
            tvContent.setText("抛出异常 ${e.message}")
        }

    }

    /**
     * age为空返回-1
     */
    fun questionMarksColon() {
        var age = null;
        val ages = age?.toInt() ?: -1
        // 结果显示-1
        tvContent.setText(ages.toString())
    }

}