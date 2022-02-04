package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwardgenrator = passwardgenrator()
        btgenerate.setOnClickListner{
            val pass:passwardgenrator = passwardgenrator.genratepassward(12,"coffe")
            tvtext.settext(pass)
        }
    }
}
