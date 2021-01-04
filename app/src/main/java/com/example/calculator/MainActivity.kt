package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Addition(view: View) {
      val num1 =  Num1.text.toString().toFloat();
        val num2 =  Num2.text.toString().toFloat();
        val ans=num1+num2
        Answer.setText("Answer :- $ans")
    }
    fun Subtraction(view: View) {
        val num1 =  Num1.text.toString().toFloat();
        val num2 =  Num2.text.toString().toFloat();
        val ans=num1-num2
        Answer.setText("Answer :- $ans")
    }
    fun multiplication(view: View) {
        val num1 =  Num1.text.toString().toFloat();
        val num2 =  Num2.text.toString().toFloat();
        val ans=num1*num2
        Answer.setText("Answer :- $ans")
    }
    fun division(view: View) {
        val num1 =  Num1.text.toString().toFloat();
        val num2 =  Num2.text.toString().toFloat();
        val ans=num1/num2
        Answer.setText("Answer :- $ans")
    }

    fun clear(view: View) {
        Num1.setText("")
        Num2.setText("")

    }


}
