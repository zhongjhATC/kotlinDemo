package com.zhongjh.kotlindemo.kotlin.kotlinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R

/**
 * 抽象类，暂时不加demo演示
 */
class AbstractActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract)
    }

}