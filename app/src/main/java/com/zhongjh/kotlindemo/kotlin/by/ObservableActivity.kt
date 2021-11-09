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
 * 演示可观察属性 Observable
 */
class ObservableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        val user = User()
        user.name = "第一次赋值"
        user.name = "第二次赋值"
    }

    class User {
        var name: String by Delegates.observable("zhongjh") { property, oldValue, newValue ->
            Log.d("ObservableActivity", "旧值：$oldValue -> 新值：$newValue")
        }
    }

}