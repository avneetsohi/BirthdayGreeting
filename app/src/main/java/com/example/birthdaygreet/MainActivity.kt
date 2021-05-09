package com.example.birthdaygreet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var personname:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        personname=findViewById(R.id.personname)
    }

    fun BirthdayCard(view: View) {


        val name= personname.editableText.toString()
        val intent= Intent(this,Birthday_Greeting_Activity::class.java)
        intent.putExtra(Birthday_Greeting_Activity.NAME_EXTRA,name)
        startActivity(intent)
    }
}