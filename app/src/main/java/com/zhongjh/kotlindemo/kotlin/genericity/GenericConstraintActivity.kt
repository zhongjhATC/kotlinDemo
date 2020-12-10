package com.zhongjh.kotlindemo.kotlin.genericity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_expand_property.*
import kotlinx.android.synthetic.main.activity_seal.*
import kotlinx.android.synthetic.main.activity_seal.btnOperator
import kotlinx.android.synthetic.main.activity_seal.tvContent

/**
 * 泛型约束
 */
class GenericConstraintActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_constraint)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        sort(listOf(1, 2, 3)) // OK。Int 是 Comparable<Int> 的子类型
        sort(listOf("123","444")) // OK。String 是 Comparable<String> 的子类型
//        sort(listOf(HashMap<Int, String>())) // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型

        // 泛型约束示范
        val list: MutableList<Int> = ArrayList()
        list.add(0)
        list.add(1)
        list.add(2)
        tvContent.append(copyWhenGreater(list,1).toString())
    }

    fun <T : Comparable<T>> sort(list: List<T>) {
        // ```
    }

    fun <T> copyWhenGreater(list: List<T>, threshold: T) : List<Number> where T : Number, T : Comparable<T> {
        return list.filter { it > threshold }.map { it }
    }


}