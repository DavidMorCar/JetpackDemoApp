package com.davidmoreno.jetpackdemo.util.base

import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.davidmoreno.jetpackdemo.util.LOADING_FRAGMENT_TAG

abstract class BaseActivity : AppCompatActivity() {

    var delayHandler: Handler = Handler()

    protected fun showLoadingDialog() {
        val prev = supportFragmentManager.findFragmentByTag(LOADING_FRAGMENT_TAG)
        val newFragment: LoadingFragmentDialog

        newFragment = if (prev == null || prev !is LoadingFragmentDialog) {
            LoadingFragmentDialog()
        } else
            prev

        if (!newFragment.isAdded) {
            newFragment.isCancelable = false
            newFragment.show(supportFragmentManager, LOADING_FRAGMENT_TAG)
        }
    }

    protected fun hideLoadingDialog() {
        val prev = supportFragmentManager.findFragmentByTag(LOADING_FRAGMENT_TAG)

        if (prev != null && prev is LoadingFragmentDialog) {
            (prev).dismiss()
        }
    }
}