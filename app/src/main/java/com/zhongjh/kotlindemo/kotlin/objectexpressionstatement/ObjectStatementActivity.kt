package com.zhongjh.kotlindemo.kotlin.objectexpressionstatement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_inner.*

/**
 * 对象声明
 * @author zhongjh
 * @date 2021/11/4
 */
class ObjectStatementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        // 其实这个就是对象表达的一种
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        DataProviderManager.registerDataProvider()
        DataProviderManager.name
    }

    object DataProviderManager {
        const val name = "name"
        fun registerDataProvider() {
        }
    }

}