package com.dilla.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener {
            addResult()
        }
        btn_minus.setOnClickListener {
            minusResult()
        }
        btn_multiply.setOnClickListener {
            timeResult()
        }
        btn_divided.setOnClickListener {
            dividedResult()
        }
    }

    fun addResult() {
        if (edit_first_number.text.isEmpty() && edit_second_number.text.isEmpty()) {
            Toast.makeText(this@MainActivity, "First or Second Number Must be Filled", Toast.LENGTH_SHORT).show()
        } else {
            var firstNumber = edit_first_number.text.toString().toFloat()
            var secondNumber = edit_second_number.text.toString().toFloat()
            var result = firstNumber + secondNumber
            result_number.setText(result.toString())
        }
    }

    fun minusResult() {
        if (edit_first_number.text.isEmpty() && edit_second_number.text.isEmpty()) {
            Toast.makeText(this@MainActivity, "First or Second Number Must be Filled", Toast.LENGTH_SHORT).show()
        } else {
            var firstNumber = edit_first_number.text.toString().toFloat()
            var secondNumber = edit_second_number.text.toString().toFloat()
            var result = firstNumber - secondNumber
            result_number.setText(result.toString())
        }
    }

    fun timeResult() {
        if (edit_first_number.text.isEmpty() && edit_second_number.text.isEmpty()) {
            Toast.makeText(this@MainActivity, "First or Second Number Must be Filled", Toast.LENGTH_SHORT).show()
        } else {
            var firstNumber = edit_first_number.text.toString().toFloat()
            var secondNumber = edit_second_number.text.toString().toFloat()
            var result = firstNumber * secondNumber
            result_number.setText(result.toString())
        }
    }

    fun dividedResult() {
        if (edit_first_number.text.isEmpty() && edit_second_number.text.isEmpty()) {
            Toast.makeText(this@MainActivity, "First or Second Number Must be Filled", Toast.LENGTH_SHORT).show()
        } else {
            var firstNumber = edit_first_number.text.toString().toFloat()
            var secondNumber = edit_second_number.text.toString().toFloat()
            var result = firstNumber / secondNumber
            result_number.setText(result.toString())
        }
    }

}
