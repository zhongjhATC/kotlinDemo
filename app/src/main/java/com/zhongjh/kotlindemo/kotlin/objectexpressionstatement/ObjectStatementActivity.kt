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

        val data1 = DataProviderManager
        val data2 = DataProviderManager
        data1.name = "test"
        tvContent.append("${data1.name} = ${data2.name}\n")

        val s1 = Site
        val s2 = Site
        s1.url = "www.zhongjh.com"
        tvContent.append("${s1.url}\n")
        tvContent.append("${s2.url}\n")

        var zhongjh = ZhongJH()
//        zhongjh.DeskTop.url  // 错误，不能通过外部类的实例访问到该对象
        ZhongJH.DeskTop.url  // 正确
    }

    object DataProviderManager {
        var name = "name"
        fun registerDataProvider() {
        }
    }

    object Site {
        var url:String = ""
        val name: String = "zhongjh"
    }

    class ZhongJH {
        var name = "zhongjh"
        object DeskTop{
            var url = "www.zhongjh.com"
            fun showName(){
//                print{"desk legs $name"} // 错误，不能访问到外部类的方法和变量
            }
        }
    }


}