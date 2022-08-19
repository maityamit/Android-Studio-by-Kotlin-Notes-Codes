package com.example.practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one:TextView = findViewById(R.id.one)
        val two:TextView = findViewById(R.id.two)
        val three:TextView = findViewById(R.id.three)
        val four:TextView = findViewById(R.id.four)
        val five:TextView = findViewById(R.id.five)
        val six:TextView = findViewById(R.id.six)
        val seven:TextView = findViewById(R.id.seven)
        val eight:TextView = findViewById(R.id.eight)
        val nine:TextView = findViewById(R.id.nine)
        val zero:TextView = findViewById(R.id.zero)

        val add:TextView = findViewById(R.id.add)
        val minus:TextView = findViewById(R.id.minus)
        val mul:TextView = findViewById(R.id.mul)
        val divide:TextView = findViewById(R.id.divide)
        val remainder:TextView = findViewById(R.id.remainder)

        val equal:TextView = findViewById(R.id.equal)
        val clear:TextView = findViewById(R.id.clear_all)
        val ans_view:TextView = findViewById(R.id.answer_view)


        var a:Int = 0
        var b:Int = 0
        var temp:String = ""

        one.setOnClickListener{
            temp+="1"
        }
        two.setOnClickListener{
            temp+="2"
        }
        three.setOnClickListener{
            temp+="3"
        }
        four.setOnClickListener{
            temp+="4"
        }
        five.setOnClickListener{
            temp+="5"
        }
        six.setOnClickListener{
            temp+="6"
        }
        seven.setOnClickListener{
            temp+="7"
        }
        eight.setOnClickListener{
            temp+="8"
        }
        nine.setOnClickListener{
            temp+="9"
        }
        zero.setOnClickListener{
            temp+="0"
        }

        var sign:Char = '$'
        add.setOnClickListener{
            a=temp.toInt()
            sign='+'
            temp=""
        }
        minus.setOnClickListener{
            a=temp.toInt()
            sign='-'
            temp=""
        }
        mul.setOnClickListener{
            a=temp.toInt()
            sign='*'
            temp=""
        }
        divide.setOnClickListener{
            a=temp.toInt()
            sign='/'
            temp=""
        }
        remainder.setOnClickListener{
            a=temp.toInt()
            sign='%'
            temp=""
        }


        equal.setOnClickListener{
            b=temp.toInt()
            temp=""
            val result = when(sign){
                '+'-> a+b
                '-'-> a-b
                '*'-> a*b
                '/'-> a/b
                '%'-> a%b
                else->{
                    0
                }
            }
            ans_view.setText(a.toString()+" "+sign+" "+b.toString()+" = "+result.toString())
        }

        clear.setOnClickListener {
            temp=""
            ans_view.setText("")
            Toast.makeText(this, "Clear Done", Toast.LENGTH_SHORT).show()
        }



    }
}