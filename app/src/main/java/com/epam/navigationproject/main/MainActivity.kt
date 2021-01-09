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

        val args = intent.extras?.let { MainActivityArgs.fromBundle(it)}
        phone.text = args?.phoneNumber
        firstNameProfile.text = args?.firstName
        lastNameProfile.text = args?.lastName
    }
}