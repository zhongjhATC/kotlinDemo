package com.zhongjh.kotlindemo.kotlin.expand.emember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_member.*

class ExpandMemberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_member)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val c = C()
        val d = D()
        tvContent.append(c.caller(d) + "\n")
        tvContent.append(c.caller2(d) + "\n")
    }

}