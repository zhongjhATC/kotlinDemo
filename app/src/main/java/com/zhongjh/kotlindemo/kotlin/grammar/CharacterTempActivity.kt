package com.zhongjh.kotlindemo.kotlin.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhongjh.kotlindemo.R
import kotlinx.android.synthetic.main.activity_character_temp.*

class CharacterTempActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_temp)
        btnCharacterString.setOnClickListener {
            main()
        }
    }

    fun main() {
        val i = 10
        val s = "i = $i" // 求值结果为 "i = 10"
        tvContent.append(s + "\n")

        val s2 = "runoob"
        val str = "$s2.length is ${s.length}" // 求值结果为 "runoob.length is 6"
        tvContent.append(str + "\n")

        val price = """
    ${'$'}9.99
    """
        tvContent.append(price)  // 求值结果为 $9.99
    }


}