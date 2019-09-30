package com.davidmoreno.jetpackdemo.modules.login.view

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidmoreno.jetpackdemo.R
import com.davidmoreno.spacenotes.common.startWithFade
import com.davidmoreno.spacenotes.common.userStartWithFade
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        startAnimation()
    }

    private fun startAnimation() {
        (loginActivityRootLayout.background as AnimationDrawable).startWithFade()
        (loginActivityUserIV.background as AnimationDrawable).userStartWithFade()
    }
}
