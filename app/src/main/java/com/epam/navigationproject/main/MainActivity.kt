package com.epam.navigationproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.epam.navigationproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Profile"

        //firstName.text =
        //lastName.text =
        //phone.text =
    }
}