package com.example.lab2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity // Make sure you have this import

class MainActivity : AppCompatActivity() {

    private lateinit var txtShow: TextView
    private lateinit var btnZero: Button
    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button
    private lateinit var btnFour: Button
    private lateinit var btnFive: Button
    private lateinit var btnSix: Button
    private lateinit var btnSeven: Button
    private lateinit var btnEight: Button
    private lateinit var btnNine: Button
    private lateinit var btnClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Consider using View Binding or Data Binding for easier view access
        setContentView(R.layout.activity_main) // Make sure you have a layout file named activity_main.xml

        txtShow = findViewById(R.id.txtShow)
        btnZero = findViewById(R.id.btnZero)
        btnOne = findViewById(R.id.btnOne)
        btnTwo = findViewById(R.id.btnTwo)
        btnThree = findViewById(R.id.btnThree)
        btnFour = findViewById(R.id.btnFour)
        btnFive = findViewById(R.id.btnFive)
        btnSix = findViewById(R.id.btnSix)
        btnSeven = findViewById(R.id.btnSeven)
        btnEight = findViewById(R.id.btnEight)
        btnNine = findViewById(R.id.btnNine)
        btnClear = findViewById(R.id.btnClear)

        // Set OnClickListener using a Kotlin lambda or a separate OnClickListener object
        val numberClickListener = View.OnClickListener { v ->
            val currentText = txtShow.text.toString()
            val button = v as Button // Cast View to Button to get its text
            txtShow.text = "$currentText${button.text}"
        }

        btnZero.setOnClickListener(numberClickListener)
        btnOne.setOnClickListener(numberClickListener)
        btnTwo.setOnClickListener(numberClickListener)
        btnThree.setOnClickListener(numberClickListener)
        btnFour.setOnClickListener(numberClickListener)
        btnFive.setOnClickListener(numberClickListener)
        btnSix.setOnClickListener(numberClickListener)
        btnSeven.setOnClickListener(numberClickListener)
        btnEight.setOnClickListener(numberClickListener)
        btnNine.setOnClickListener(numberClickListener)

        btnClear.setOnClickListener {
            txtShow.text = "電話號碼：" // Assuming this is your desired clear text
        }
    }
}
