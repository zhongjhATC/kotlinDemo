package com.zhongjh.kotlindemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.kotlin.datatype.AnOperatorActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CharActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CharacterStringActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CompareActivity
import com.zhongjh.kotlindemo.kotlin.grammar.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFun.setOnClickListener {
            val intent = Intent(this, FunActivity::class.java)
            startActivity(intent)
        }
        btnCharacter.setOnClickListener {
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }

        btnNull.setOnClickListener {
            val intent = Intent(this, NullActivity::class.java)
            startActivity(intent)
        }

        btnIs.setOnClickListener {
            val intent = Intent(this, IsActivity::class.java)
            startActivity(intent);
        }

        btnSection.setOnClickListener {
            val intent = Intent(this, SectionActivity::class.java)
            startActivity(intent);
        }

        btnCompare.setOnClickListener {
            val intent = Intent(this, CompareActivity::class.java)
            startActivity(intent)
        }

        btnAnOperator.setOnClickListener {
            val intent = Intent(this, AnOperatorActivity::class.java)
            startActivity(intent)
        }

        btnChar.setOnClickListener {
            val intent = Intent(this, CharActivity::class.java)
            startActivity(intent)
        }

        btnCharacterString.setOnClickListener {
            val intent = Intent(this, CharacterStringActivity::class.java)
            startActivity(intent)
        }

    }

}