package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Btn_multiplication.setOnClickListener {
            var num1 = edt_fnum.text.toString()
            var num2 = Edt_snum.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                Text_answer.text = "please feel in the details"
            } else {
                var answer = num1.toDouble() * num2.toDouble()
                Text_answer.text = answer.toString()
            }

        }
        Btn_add.setOnClickListener {
            var num1 = edt_fnum.text.toString()
            var num2 = Edt_snum.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                Text_answer.text = "please feel in the details"
            } else {
                var answer = num1.toDouble() + num2.toDouble()
                Text_answer.text = answer.toString()
            }
        }
        Btn_subtract.setOnClickListener {
            var num1 = edt_fnum.text.toString()
            var num2 = Edt_snum.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                Text_answer.text = "please feel in the details"
            } else {
                var answer = num1.toDouble() - num2.toDouble()
                Text_answer.text = answer.toString()
            }
        }
        Btn_division.setOnClickListener {
            var num1 = edt_fnum.text.toString()
            var num2 = Edt_snum.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                Text_answer.text = "please feel in the details"
            } else {
                var answer = num1.toDouble() / num2.toDouble()
                Text_answer.text = answer.toString()
            }
        }
    }
}