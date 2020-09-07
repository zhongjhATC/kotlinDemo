package com.zhongjh.kotlindemo

import android.app.ActivityManager
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.kotlin.any.overwriteclass.OverwriteActivity
import com.zhongjh.kotlindemo.kotlin.any.subclass.SubclassActivity
import com.zhongjh.kotlindemo.kotlin.condition.IfActivity
import com.zhongjh.kotlindemo.kotlin.condition.RangeActivity
import com.zhongjh.kotlindemo.kotlin.condition.WhenActivity
import com.zhongjh.kotlindemo.kotlin.datatype.AnOperatorActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CharActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CharacterStringActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CompareActivity
import com.zhongjh.kotlindemo.kotlin.forLoop.ReturnActivity
import com.zhongjh.kotlindemo.kotlin.forLoop.WhileActivity
import com.zhongjh.kotlindemo.kotlin.grammar.*
import com.zhongjh.kotlindemo.kotlin.kotlinclass.AnonymousInnerActivity
import com.zhongjh.kotlindemo.kotlin.kotlinclass.InnerActivity
import com.zhongjh.kotlindemo.kotlin.kotlinclass.NestActivity
import com.zhongjh.kotlindemo.kotlin.kotlinclass.PersonActivity
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

        btnCharacterStringTemp.setOnClickListener {
            val intent = Intent(this, CharacterTempActivity::class.java)
            startActivity(intent)
        }

        btnIF.setOnClickListener {
            val intent = Intent(this, IfActivity::class.java)
            startActivity(intent)
        }

        btnRange.setOnClickListener {
            val intent = Intent(this, RangeActivity::class.java)
            startActivity(intent)
        }

        btnWhen.setOnClickListener {
            val intent = Intent(this, WhenActivity::class.java)
            startActivity(intent)
        }

        btnWhile.setOnClickListener {
            val intent = Intent(this, WhileActivity::class.java)
            startActivity(intent)
        }

        btnReturn.setOnClickListener {
            val intent = Intent(this, ReturnActivity::class.java)
            startActivity(intent)
        }

        btnClass.setOnClickListener {
            val intent = Intent(this, PersonActivity::class.java)
            startActivity(intent)
        }

        btnNest.setOnClickListener {
            val intent = Intent(this, NestActivity::class.java)
            startActivity(intent)
        }

        btnInner.setOnClickListener {
            val intent = Intent(this, InnerActivity::class.java)
            startActivity(intent)
        }

        btnAnonymousInner.setOnClickListener {
            val intent = Intent(this, AnonymousInnerActivity::class.java)
            startActivity(intent)
        }

        btnSubClass.setOnClickListener {
            val intent = Intent(this, SubclassActivity::class.java)
            startActivity(intent)
        }

        btnOverWriteClass.setOnClickListener {
            val intent = Intent(this, OverwriteActivity::class.java)
            startActivity(intent)
        }

//        btnOverWriteProperty

        btnExit.setOnClickListener {
//            Handler().postDelayed(Runnable {
//                android.os.Process.killProcess(android.os.Process.myPid());
//
//                System.exit(0);
//            }, 500)
//            ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE)
//            am.killBackgroundProcesses("cn.com.android123.cwj")

        }

    }
}