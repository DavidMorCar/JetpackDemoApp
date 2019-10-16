package com.davidmoreno.jetpackdemo.modules.login.view

import android.os.Bundle
import com.davidmoreno.jetpackdemo.R
import com.davidmoreno.jetpackdemo.util.base.BaseActivity

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.loginActivityContainer, LoginFragment.newInstance())
                .commitNow()
        }
    }


}
