package com.superconsult.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        buttonSubmit.setOnClickListener{
            Toast.makeText(applicationContext,"hello",Toast.LENGTH_LONG).show()
        }



    }
}
