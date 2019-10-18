package com.davidmoreno.jetpackdemo.modules.login.view


import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.davidmoreno.jetpackdemo.R
import com.davidmoreno.jetpackdemo.modules.login.viewmodel.LoginViewModel
import com.davidmoreno.jetpackdemo.util.InjectorUtils
import com.davidmoreno.jetpackdemo.util.LOGIN_RECOVERY_FRAGMENT_TAG
import com.davidmoreno.jetpackdemo.util.base.BaseFragment
import com.davidmoreno.spacenotes.common.startWithFade
import com.davidmoreno.spacenotes.common.userStartWithFade
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment() {

    private val recoveryFragment = LoginRecoveryFragment()

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val viewModel: LoginViewModel by viewModels {
        InjectorUtils.provideLoginViewModelFactory()
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
        initAnimation()
        initViewModel()
        initView()
    }

    private fun initAnimation() {
        (loginFragmentRootLayout.background as AnimationDrawable).startWithFade()
        (loginFragmentUserIV.background as AnimationDrawable).userStartWithFade()
    }

    private fun initView() {
        loginFragmentLoginButton.setOnClickListener {
            viewModel.checkUserLogin(
                loginFragmentEmailET.text.toString(),
                loginFragmentPasswordET.text.toString()
            )
            showLoadingDialog()
        }
        loginFragmentRestoreTV.setOnClickListener {
            showRecoveryFragment()
        }
    }

    private fun initViewModel() {
        viewModel.loginStatus.observe(viewLifecycleOwner) { result ->
            hideLoadingDialog()
            Log.e("Result:", result.toString())
        }
    }

    private fun showRecoveryFragment() {
        val fragment =
            activity?.supportFragmentManager?.findFragmentByTag(LOGIN_RECOVERY_FRAGMENT_TAG)

        val loginRecoveryFragment: LoginRecoveryFragment

        loginRecoveryFragment = if (fragment == null)
            LoginRecoveryFragment()
        else {
            fragment as LoginRecoveryFragment
        }

        if (loginRecoveryFragment.dialog != null && loginRecoveryFragment.dialog!!.isShowing) {
            loginRecoveryFragment.isCancelable = true
        } else {
            loginRecoveryFragment.isCancelable = true
            activity?.supportFragmentManager?.let {
                loginRecoveryFragment.show(it, LOGIN_RECOVERY_FRAGMENT_TAG)
            }
        }
    }

}
