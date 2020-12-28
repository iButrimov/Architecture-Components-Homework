package com.epam.navigationproject.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.epam.navigationproject.R
import kotlinx.android.synthetic.main.fragment_create_profile.*

class CreateProfileFragment : Fragment(R.layout.fragment_create_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as? AppCompatActivity)?.supportActionBar?.title = "Create profile"

        // phoneNumber.setText(phone)

        button.setOnClickListener {
            // TODO: navigate to main activity
        }
    }

}