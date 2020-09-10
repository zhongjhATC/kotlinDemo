package com.zhongjh.kotlindemo.kotlin.expand.efun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_fun.*

/**
 * 扩展函数
 */
class ExpandFunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_fun)
        btnOperator.setOnClickListener { main() }
    }

    /**
     * 扩展函数
     */
    fun User.Print(): String {
        return "用户名 $name"
    }

    /**
     * 扩展函数 swap,调换不同位置的值
     */
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        // this是该列表
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }

    fun C.foo() = "c" // 扩展函数 foo
    fun D.foo() = "d" // 扩展函数 foo
    // 类型是C类
    fun tvContentAppend(c: C) {
        tvContent.append(c.foo() + "\n")
    }

    /**
     * 测试成员函数跟扩展函数
     */
    fun A.foo() : String {
        return "扩展函数"
    }

    fun main() {
        val user = User("zhongjh\n")
        tvContent.append(user.Print())

        val l = mutableListOf(1, 2, 3)
        // 位置 0 和 2 的值做了互换，'swap()' 函数内的 'this' 将指向 'l' 的值
        l.swap(0, 2)
        tvContent.append(l.toString() + "\n")

        tvContentAppend(D());

        var a = A()
        tvContent.append(a.foo() + "\n")
    }

}