package com.zhongjh.kotlindemo.kotlin.expand.emember2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_member.*

/**
 * 扩展声明为成员2: 以成员的形式定义的扩展函数
 */
class ExpandMember2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_member2)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        tvContent.append(C().caller(D())) // 输出 "D.foo in C"
        tvContent.append(C1().caller(D()))  // 输出 "D.foo in C1" —— 分发接收者虚拟解析
        tvContent.append(C().caller(D1()))  // 输出 "D.foo in C" —— 扩展接收者静态解析
    }

}