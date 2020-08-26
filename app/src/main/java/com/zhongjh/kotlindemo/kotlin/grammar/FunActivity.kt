package com.zhongjh.kotlindemo.kotlin.grammar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_fun.*

@SuppressLint("SetTextI18n")
class FunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun)
        btnSum.setOnClickListener { tvContent.setText("sum" + sum(1, 1).toString()); }
        btnSum2.setOnClickListener { tvContent.setText("sum2" + sum2(1, 1).toString()); }
        btnSum3.setOnClickListener { tvContent.setText("sum3" + sum3(1, 1).toString()); }
        btnSum4.setOnClickListener { sum4(1, 1); }
        btnSum5.setOnClickListener { sum5(1, 1); }
        btnVararg.setOnClickListener { vars(1, 2, 3, 4, 5, 6, 7); }
        btnLambda.setOnClickListener { lambda() }
    }

    /**
     * Int 参数，返回值 Int
     * @param a 第一个加数
     * @param b 第一个加数
     * @return 两个数的和
     */
    fun sum(a: Int, b: Int): Int {
        return (a + b);
    }

    /**
     * 表达式作为函数体，返回类型自动推断
     */
    fun sum2(a: Int, b: Int) = a + b

    /**
     * public 方法则必须明确写出返回类型
     */
    public fun sum3(a: Int, b: Int): Int = a + b

    /**
     * 无返回值的函数(类似Java中的void)：
     */
    fun sum4(a: Int, b: Int): Unit {
        tvContent.setText("sum4" + (a + b).toString());
    }

    /**
     * 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
     */
    public fun sum5(a: Int, b: Int) {
        tvContent.setText("sum5" + (a + b).toString());
    }

    /**
     * 可变长参数函数 ,vararg关键字，作用类似用java的String...
     */
    fun vars(vararg v: Int) {
        for (vt in v) {
            tvContent.append(vt.toString())
        }
    }

    /**
     * lambda表达式使用实例
     */
    fun lambda() {
        val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
        tvContent.setText(sumLambda(1, 2).toString())
    }

}