package com.zhongjh.kotlindemo.kotlin.dataclass;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_seal.*

// 这个放在里面会报错，但是放在外面又显示kt
// 有另外一种方式呈现https://stackoverflow.com/questions/51054789/sealed-classes-inside-another-class-in-kotlin-cant-be-compiled-cannot-access，通过sealed显示
sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // the `else` clause is not required because we've covered all the cases
}


/**
 * 密封类
 */
class SealTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seal)
        btnOperator.setOnClickListener { main() }
    }

    fun main() {
        val c = Const(5.0)
        val s = Sum(Const(1.0), Const(3.0))

        println(eval(c))
        println(eval(s))
    }

}

