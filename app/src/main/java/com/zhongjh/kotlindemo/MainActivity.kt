package com.zhongjh.kotlindemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.kotlindemo.kotlin.by.*
import com.zhongjh.kotlindemo.kotlin.inheritance.overwriteclass.OverwriteActivity
import com.zhongjh.kotlindemo.kotlin.inheritance.overwriteproperty.OverwritePropertyActivity
import com.zhongjh.kotlindemo.kotlin.inheritance.subclass.SubclassActivity
import com.zhongjh.kotlindemo.kotlin.condition.IfActivity
import com.zhongjh.kotlindemo.kotlin.condition.RangeActivity
import com.zhongjh.kotlindemo.kotlin.condition.WhenActivity
import com.zhongjh.kotlindemo.kotlin.dataclass.CopyActivity
import com.zhongjh.kotlindemo.kotlin.dataclass.SealTypeActivity
import com.zhongjh.kotlindemo.kotlin.datatype.AnOperatorActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CharActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CharacterStringActivity
import com.zhongjh.kotlindemo.kotlin.datatype.CompareActivity
import com.zhongjh.kotlindemo.kotlin.enum.EnumActivity
import com.zhongjh.kotlindemo.kotlin.expand.associatedobject.ExpandAssociatedObjectActivity
import com.zhongjh.kotlindemo.kotlin.expand.efun.ExpandFunActivity
import com.zhongjh.kotlindemo.kotlin.expand.emember.ExpandMemberActivity
import com.zhongjh.kotlindemo.kotlin.expand.emember2.ExpandMember2Activity
import com.zhongjh.kotlindemo.kotlin.expand.enull.ExpandNullActivity
import com.zhongjh.kotlindemo.kotlin.expand.eproperty.ExpandPropertyActivity
import com.zhongjh.kotlindemo.kotlin.forLoop.ReturnActivity
import com.zhongjh.kotlindemo.kotlin.forLoop.WhileActivity
import com.zhongjh.kotlindemo.kotlin.genericity.*
import com.zhongjh.kotlindemo.kotlin.grammar.*
import com.zhongjh.kotlindemo.kotlin.kotlinclass.AnonymousInnerActivity
import com.zhongjh.kotlindemo.kotlin.kotlinclass.InnerActivity
import com.zhongjh.kotlindemo.kotlin.kotlinclass.NestActivity
import com.zhongjh.kotlindemo.kotlin.kotlinclass.PersonActivity
import com.zhongjh.kotlindemo.kotlin.kotlininterface.funoverwrite.FunOverwriteActivity
import com.zhongjh.kotlindemo.kotlin.kotlininterface.kotilininterface.KotlinInterfaceActivity
import com.zhongjh.kotlindemo.kotlin.objectexpressionstatement.ObjectCompanionActivity
import com.zhongjh.kotlindemo.kotlin.objectexpressionstatement.ObjectExpressionActivity
import com.zhongjh.kotlindemo.kotlin.objectexpressionstatement.ObjectStatementActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // region Kotlin 基础语法

        // 函数
        btnFun.setOnClickListener {
            val intent = Intent(this, FunActivity::class.java)
            startActivity(intent)
        }
        // 字符串
        btnCharacter.setOnClickListener {
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }
        // NULL检查机制
        btnNull.setOnClickListener {
            val intent = Intent(this, NullActivity::class.java)
            startActivity(intent)
        }
        // is(类似instanceof)
        btnIs.setOnClickListener {
            val intent = Intent(this, IsActivity::class.java)
            startActivity(intent);
        }
        // 区间..
        btnSection.setOnClickListener {
            val intent = Intent(this, SectionActivity::class.java)
            startActivity(intent);
        }
        // endregion

        // region Kotlin 基本数据类型

        // 比较两个数字
        btnCompare.setOnClickListener {
            val intent = Intent(this, CompareActivity::class.java)
            startActivity(intent)
        }
        // btnAnOperator
        btnAnOperator.setOnClickListener {
            val intent = Intent(this, AnOperatorActivity::class.java)
            startActivity(intent)
        }
        // 字符
        btnChar.setOnClickListener {
            val intent = Intent(this, CharActivity::class.java)
            startActivity(intent)
        }
        // 字符串
        btnCharacterString.setOnClickListener {
            val intent = Intent(this, CharacterStringActivity::class.java)
            startActivity(intent)
        }
        // 字符串模板
        btnCharacterStringTemp.setOnClickListener {
            val intent = Intent(this, CharacterTempActivity::class.java)
            startActivity(intent)
        }

        // endregion

        // region Kotlin 条件控制

        // if表达式
        btnIF.setOnClickListener {
            val intent = Intent(this, IfActivity::class.java)
            startActivity(intent)
        }
        // 在区间内
        btnRange.setOnClickListener {
            val intent = Intent(this, RangeActivity::class.java)
            startActivity(intent)
        }
        // when
        btnWhen.setOnClickListener {
            val intent = Intent(this, WhenActivity::class.java)
            startActivity(intent)
        }
        // while
        btnWhile.setOnClickListener {
            val intent = Intent(this, WhileActivity::class.java)
            startActivity(intent)
        }
        // return \ break \ continue
        btnReturn.setOnClickListener {
            val intent = Intent(this, ReturnActivity::class.java)
            startActivity(intent)
        }

        // endregion

        // region Kotlin 类和对象

        // 类演示
        btnClass.setOnClickListener {
            val intent = Intent(this, PersonActivity::class.java)
            startActivity(intent)
        }

        // 嵌套类
        btnNest.setOnClickListener {
            val intent = Intent(this, NestActivity::class.java)
            startActivity(intent)
        }

        // 内部类
        btnInner.setOnClickListener {
            val intent = Intent(this, InnerActivity::class.java)
            startActivity(intent)
        }

        // 匿名内部类
        btnAnonymousInner.setOnClickListener {
            val intent = Intent(this, AnonymousInnerActivity::class.java)
            startActivity(intent)
        }

        // endregion

        // region Kotlin 继承

        // 类的构造函数
        btnSubClass.setOnClickListener {
            val intent = Intent(this, SubclassActivity::class.java)
            startActivity(intent)
        }

        // 重写类的演示
        btnOverWriteClass.setOnClickListener {
            val intent = Intent(this, OverwriteActivity::class.java)
            startActivity(intent)
        }

        // 重写属性
        btnOverWriteProperty.setOnClickListener {
            val intent = Intent(this, OverwritePropertyActivity::class.java)
            startActivity(intent)
        }

        // endregion

        // region Kotlin 接口

        // 接口
        btnKotilinInterface.setOnClickListener {
            val intent = Intent(this, KotlinInterfaceActivity::class.java)
            startActivity(intent)
        }

        // 接口重写函数
        btnFunOverwrite.setOnClickListener {
            val intent = Intent(this, FunOverwriteActivity::class.java)
            startActivity(intent)
        }

        // 扩展函数
        btnExpandFun.setOnClickListener {
            val intent = Intent(this, ExpandFunActivity::class.java)
            startActivity(intent)
        }

        // 扩展一个空对象
        btnExpandNull.setOnClickListener {
            val intent = Intent(this, ExpandNullActivity::class.java)
            startActivity(intent)
        }

        // 伴生对象的扩展
        btnExpandAssociatedObject.setOnClickListener {
            val intent = Intent(this, ExpandAssociatedObjectActivity::class.java)
            startActivity(intent)
        }

        // 扩展属性
        btnExpandProperty.setOnClickListener {
            val intent = Intent(this, ExpandPropertyActivity::class.java)
            startActivity(intent)
        }

        // 扩展声明为成员
        btnExpandMember.setOnClickListener {
            val intent = Intent(this, ExpandMemberActivity::class.java)
            startActivity(intent)
        }

        // 以成员的形式定义的扩展函数
        btnExpandMember2.setOnClickListener {
            val intent = Intent(this, ExpandMember2Activity::class.java)
            startActivity(intent)
        }

        // endregion

        // region Kotlin 数据类与密封类

        // 复制
        btnCopy.setOnClickListener {
            val intent = Intent(this, CopyActivity::class.java)
            startActivity(intent)
        }

        // 密封类
        btnSeal.setOnClickListener {
            val intent = Intent(this, SealTypeActivity::class.java)
            startActivity(intent)
        }

        // endregion 数据类与密封类

        // region Kotlin 泛型类

        // 泛型基本声明
        btnGenericity.setOnClickListener {
            val intent = Intent(this, GenericityActivity::class.java)
            startActivity(intent)
        }

        // 泛型选择
        btnGenericityWhen.setOnClickListener {
            val intent = Intent(this, GenericityWhenActivity::class.java)
            startActivity(intent)
        }

        // 泛型约束
        btnGenericConstrain.setOnClickListener {
            val intent = Intent(this, GenericConstraintActivity::class.java)
            startActivity(intent)
        }

        // 型变
        btnMorph.setOnClickListener {
            val intent = Intent(this, MorphActivity::class.java)
            startActivity(intent)
        }

        // 星号投射
        btnRadialProjection.setOnClickListener {
            val intent = Intent(this, RadialProjectionActivity::class.java)
            startActivity(intent)
        }

        // endregion 泛型类

        // region Kotlin 枚举类

        btnEnum.setOnClickListener {
            val intent = Intent(this, EnumActivity::class.java)
            startActivity(intent)
        }

        // endregion Kotlin 对象表达式和对象声明

        // region Kotlin 对象表达式和对象声明

        btnObjectExpression.setOnClickListener {
            val intent = Intent(this, ObjectExpressionActivity::class.java)
            startActivity(intent)
        }

        btnObjectStatement.setOnClickListener {
            val intent = Intent(this, ObjectStatementActivity::class.java)
            startActivity(intent)
        }

        btnObjectCompanion.setOnClickListener {
            val intent = Intent(this, ObjectCompanionActivity::class.java)
            startActivity(intent)
        }

        // endregion Kotlin 对象表达式和对象声明

        // region Kotlin 委托

        btnByClass.setOnClickListener {
            val intent = Intent(this, ByClassActivity::class.java)
            startActivity(intent)
        }

        btnByProperty.setOnClickListener {
            val intent = Intent(this, ByPropertyActivity::class.java)
            startActivity(intent)
        }

        btnByLazy.setOnClickListener {
            val intent = Intent(this, LazyActivity::class.java)
            startActivity(intent)
        }

        btnObservable.setOnClickListener {
            val intent = Intent(this, ObservableActivity::class.java)
            startActivity(intent)
        }

        btnByMap.setOnClickListener {
            val intent = Intent(this, ByMapActivity::class.java)
            startActivity(intent)
        }

        btnNotNull.setOnClickListener {
            val intent = Intent(this, NotNullActivity::class.java)
            startActivity(intent)
        }

        // endregion Kotlin 委托


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