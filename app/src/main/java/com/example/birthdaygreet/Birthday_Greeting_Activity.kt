package com.example.birthdaygreet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthday_Greeting_Activity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name"
    }

    lateinit var greeting:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday__greeting_)
        greeting=findViewById(R.id.greeting)
        val name=intent.getStringExtra(NAME_EXTRA)
        greeting.text="Happy Birthday\n $name!!!"
    }
}