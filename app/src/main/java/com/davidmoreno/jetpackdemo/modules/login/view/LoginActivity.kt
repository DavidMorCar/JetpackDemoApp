package com.davidmoreno.jetpackdemo.modules.login.view

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.activity.viewModels
import com.davidmoreno.jetpackdemo.R
import com.davidmoreno.jetpackdemo.modules.login.viewmodel.LoginViewModel
import com.davidmoreno.jetpackdemo.util.InjectorUtils
import com.davidmoreno.jetpackdemo.util.base.BaseActivity
import com.davidmoreno.spacenotes.common.startWithFade
import com.davidmoreno.spacenotes.common.userStartWithFade
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


}
