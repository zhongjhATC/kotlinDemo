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
class ByMapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_expression)
        btnOperator.setOnClickListener {
            main()
        }
    }

    fun main() {
        // 构造函数接受一个映射参数
        val site = Site(
            mapOf(
                "name" to "zhongjh",
                "url" to "www.zhongjh.com"
            )
        )

        Log.d("ByMapActivity", site.name)
        Log.d("ByMapActivity", site.url)

        val map: MutableMap<String, Any?> = mutableMapOf(
            "name" to "zhongjh",
            "url" to "www.zhongjh.com"
        )
        val site2 = Site2(map)
        Log.d("ByMapActivity", site2.name)
        Log.d("ByMapActivity", site2.url)
        map.put("name", "Google")
        map.put("url", "www.google.com")
        Log.d("ByMapActivity", site2.name)
        Log.d("ByMapActivity", site2.url)
    }

    class Site(map: Map<String, Any?>) {
        val name: String by map
        val url: String by map
    }

    class Site2(map: MutableMap<String, Any?>) {
        val name: String by map
        val url: String by map
    }

}