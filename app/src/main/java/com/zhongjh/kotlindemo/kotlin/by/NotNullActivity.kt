package com.zhongjh.kotlindemo.kotlin.by

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyCharacterMap
import android.view.View
import com.zhongjh.kotlindemo.R
import com.zhongjh.kotlindemo.kotlin.inheritance.overwrite
import kotlinx.android.synthetic.main.activity_inner.*
import kotlin.properties.Delegates

/**
 * 演示 把属性储存在映射中
 */
class NotNullActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        val foo = Foo()
//        foo.notNullBar // by notNull后，这样是会报异常的
        foo.notNullBar = "bar"
    }

    class Foo {
        var notNullBar: String by Delegates.notNull()
    }

}