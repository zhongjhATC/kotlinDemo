package com.zhongjh.kotlindemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.kotlin.*
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
    }

}