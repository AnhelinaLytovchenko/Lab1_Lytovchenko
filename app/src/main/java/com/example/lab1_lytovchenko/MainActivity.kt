package com.example.lab1_lytovchenko

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk = findViewById<Button>(R.id.btnOk)
        val num1 = findViewById<EditText>(R.id.number1)
        val num2 = findViewById<EditText>(R.id.number2)
        val radioGroup = findViewById<RadioGroup>(R.id.operations)
        val resultView = findViewById<TextView>(R.id.resultText)

        btnOk.setOnClickListener {
            val s1 = num1.text.toString()
            val s2 = num2.text.toString()
            val checkedId = radioGroup.checkedRadioButtonId

            if (s1.isEmpty() || s2.isEmpty() || checkedId == -1) {
                Toast.makeText(this, "Будь ласка, завершіть введення всіх даних!", Toast.LENGTH_LONG).show()
            } else {
                val val1 = s1.toDouble()
                val val2 = s2.toDouble()
                var res = 0.0

                if (checkedId == R.id.plus) res = val1 + val2
                else res = val1 - val2

                resultView.text = "Результат: $res"
            }
        }
    }
}
