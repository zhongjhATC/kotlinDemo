package com.zhongjh.kotlindemo.kotlin.dataclass;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_an_operator.*
import kotlinx.android.synthetic.main.activity_seal.*
import kotlinx.android.synthetic.main.activity_seal.tvContent

// 这个放在里面会报错，但是放在外面又显示kt
// 有另外一种方式呈现https://stackoverflow.com/questions/51054789/sealed-classes-inside-another-class-in-kotlin-cant-be-compiled-cannot-access，通过sealed显示
sealed class Expr // 要声明一个密封类，需要在类名前面添加 sealed 修饰符。虽然密封类也可以有子类，但是所有子类都必须在与密封类自身相同的文件中声明
data class Const(val number: Double) : Expr() // 可以创建一个只包含数据的类，关键字为 data
data class Sum(val e1: Expr, val e2: Expr) : Expr() // 可以创建一个只包含数据的类，关键字为 data
object NotANumber : Expr()

// 这个用到了类似case when语法判断is Const 或者 is Sum
fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
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

        tvContent.append(eval(c).toString())
        tvContent.append("\n")
        tvContent.append(eval(s).toString())
        tvContent.append("\n")
    }

}

