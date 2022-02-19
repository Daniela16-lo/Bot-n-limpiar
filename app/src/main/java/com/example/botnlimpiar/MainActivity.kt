package com.example.botnlimpiar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //private var userInput: EditText? = null
    //private var button: Button? =null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<Button>(R.id.textView2)
        val button1: Button = findViewById<Button>(R.id.button2)

        textView?.text= ""

        button?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.setText("")
            }
        })

        button1?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                textView?.text=""
            }
        })
    }
}