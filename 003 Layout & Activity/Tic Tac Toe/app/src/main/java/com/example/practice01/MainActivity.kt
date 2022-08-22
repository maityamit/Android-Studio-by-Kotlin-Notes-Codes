package com.example.practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val a1:Button = findViewById(R.id.one)
        val b1:Button = findViewById(R.id.two)
        val c1:Button = findViewById(R.id.three)

        val a2:Button = findViewById(R.id.four)
        val b2:Button = findViewById(R.id.five)
        val c2:Button = findViewById(R.id.six)

        val a3:Button = findViewById(R.id.seven)
        val b3:Button = findViewById(R.id.eight)
        val c3:Button = findViewById(R.id.nine)



        var state:Boolean = true

        a1.setOnClickListener{
            if(state){
                state=false
                a1.setText("X")
                a1.isEnabled=false
            }else{
                state=true
                a1.setText("O")
                a1.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())
        }
        b1.setOnClickListener{
            if(state){
                state=false
                b1.setText("X")
                b1.isEnabled=false
            }else{
                state=true
                b1.setText("O")
                b1.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }
        c1.setOnClickListener{
            if(state){
                state=false
                c1.setText("X")
                c1.isEnabled=false
            }else{
                state=true
                c1.setText("O")
                c1.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }

        a2.setOnClickListener{
            if(state){
                state=false
                a2.setText("X")
                a2.isEnabled=false
            }else{
                state=true
                a2.setText("O")
                a2.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }
        b2.setOnClickListener{
            if(state){
                state=false
                b2.setText("X")
                b2.isEnabled=false
            }else{
                state=true
                b2.setText("O")
                b2.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }
        c2.setOnClickListener{
            if(state){
                state=false
                c2.setText("X")
                c2.isEnabled=false
            }else{
                state=true
                c2.setText("O")
                c2.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }

        a3.setOnClickListener{
            if(state){
                state=false
                a3.setText("X")
                a3.isEnabled=false
            }else{
                state=true
                a3.setText("O")
                a3.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }
        b3.setOnClickListener{
            if(state){
                state=false
                b3.setText("X")
                b3.isEnabled=false
            }else{
                state=true
                b3.setText("O")
                b3.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }
        c3.setOnClickListener{
            if(state){
                state=false
                c3.setText("X")
                c3.isEnabled=false
            }else{
                state=true
                c3.setText("O")
                c3.isEnabled=false
            }
            helper(a1.text.toString(),b1.text.toString(),c1.text.toString(),a2.text.toString(),b2.text.toString(),c2.text.toString(),a3.text.toString(),b3.text.toString(),c3.text.toString())

        }



    }


    fun helper2(v:String){
        val hy:TextView = findViewById(R.id.win_text)
        hy.setText(v)
    }

    fun helper(v1:String,v2:String,v3:String,v4:String,v5:String,v6:String,v7:String,v8:String,v9:String){



        if(v1==v2 && v2==v3) {
            if (v1 == "X") {
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v4==v5 && v5==v6){
            if(v4=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v7==v8 && v8==v9){
            if(v7=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v1==v4 && v4==v7){
            if(v1=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v2==v5 && v5==v8){
            if(v2=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v3==v6 && v6==v9){
            if(v3=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v1==v5 && v5==v9){
            if(v1=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }else if(v3==v5 && v5==v7){
            if(v3=="X"){
                helper2("Player 01 Win")
            }
            if(v3=="O"){
                helper2("Player 02 Win")
            }
        }


    }

}