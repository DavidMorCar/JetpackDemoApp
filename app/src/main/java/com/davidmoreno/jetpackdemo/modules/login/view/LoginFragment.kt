package com.davidmoreno.jetpackdemo.modules.login.view


import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels

import com.davidmoreno.jetpackdemo.modules.login.viewmodel.LoginViewModel
import com.davidmoreno.jetpackdemo.util.InjectorUtils
import com.davidmoreno.spacenotes.common.startWithFade
import com.davidmoreno.spacenotes.common.userStartWithFade
import kotlinx.android.synthetic.main.fragment_login.*

import androidx.lifecycle.observe
import com.davidmoreno.jetpackdemo.R
import com.davidmoreno.jetpackdemo.util.base.BaseFragment


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : BaseFragment() {



    private val viewModel: LoginViewModel by viewModels {
        InjectorUtils.provideLoginViewModelFactory(activity!!)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startAnimation()
        initView()
    }

    private fun startAnimation() {
        (loginFragmentRootLayout.background as AnimationDrawable).startWithFade()
        (loginFragmentUserIV.background as AnimationDrawable).userStartWithFade()
    }

    private fun initView(){
        loginFragmentLoginButton.setOnClickListener { showLoadingDialog() }
    }

    private fun initViewModel(){
        viewModel.loginStatus.observe(viewLifecycleOwner) { result ->

        }
    }}
