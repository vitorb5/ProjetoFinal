package com.codelab.example.evosystems

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.codelab.example.evosystems.DBHelper.DBHelper
import com.codelab.example.evosystems.Model.Funcionario

class SecondActivity : AppCompatActivity() {

    internal lateinit var -->db:DBHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }


}
