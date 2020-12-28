package com.epam.navigationproject.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.epam.navigationproject.R
import kotlinx.android.synthetic.main.fragment_sms_code_confirmation.*

class SmsCodeConfirmationFragment : Fragment(R.layout.fragment_sms_code_confirmation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as? AppCompatActivity)?.supportActionBar?.title = "SMS code"

        // phoneNumber.setText(phone)
        button.setOnClickListener {
            // TODO: navigate to profile creation
        }
    }

}