package com.epam.navigationproject.splash

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.epam.navigationproject.R
import kotlinx.android.synthetic.main.fragment_splash.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

/*        lifecycleScope.launch {
            delay(1000)
            progress.isVisible = true
            delay(2000)
            progress.isVisible = false

            // TODO: navigate to authorization flow
        }*/
    }

}