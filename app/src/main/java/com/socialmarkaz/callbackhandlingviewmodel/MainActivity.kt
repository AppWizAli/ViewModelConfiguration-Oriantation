package com.socialmarkaz.callbackhandlingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModelclass: ViewModelclass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///by using this ,ewn i chage orientation then data will start frome same not from start agan
        viewModelclass=ViewModelProvider(this).get(ViewModelclass::class.java)



       ///By using this ,,when orietation cange ,data will start gain ,,me restart from 0
        // viewModelclass=ViewModelclass()


        var btn= findViewById<Button>(R.id.button)
        var tv= findViewById<TextView>(R.id.herllo)
        tv.text=viewModelclass.getcurrentcounter().toString()

        btn.setOnClickListener {
            tv.text=viewModelclass.updatecounter().toString()
        }
    }
}