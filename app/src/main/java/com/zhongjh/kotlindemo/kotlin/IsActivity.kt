package com.zhongjh.kotlindemo.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_is.*

class IsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is)
        btnStringLength.setOnClickListener { tvContent.setText(getStringLength("123456").toString()) }
        btnStringLength2.setOnClickListener { tvContent.setText(getStringLength2("1234567").toString()) }
    }

    /**
     * Kotlin中所有的类都有一个共同的基类Any
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }

        //在这里还有一种方法，与Java中instanceof不同，使用!is
        // if (obj !is String){
        //   // XXX
        // }

        // 到了这里的obj仍然是Any类型的引用
        return null
    }

    /**
     * 也可以采用这种方式
     */
    fun getStringLength2(obj: Any): Int? {
        // 在 `&&` 运算符的右侧, `obj` 的类型会被自动转换为 `String`
        if (obj is String && obj.length > 0)
            return obj.length
        return null
    }

}