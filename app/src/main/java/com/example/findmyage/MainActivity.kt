package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buClickEvent(view: View) {
        //fire when button is clicked
        var yearOfBirth:Int = txtYearOfBirth.text.toString().toInt();
        val currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if(yearOfBirth==0 || yearOfBirth>currentYear){
            txtShowAge.text = "Invalid Input"
            return;
        }
        val myAge = currentYear - yearOfBirth;
        txtShowAge.text ="Your age is $myAge years";
    }
}
