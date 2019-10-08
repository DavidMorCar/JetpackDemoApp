package com.davidmoreno.jetpackdemo.util.base

import android.os.Handler
import androidx.fragment.app.Fragment
import com.davidmoreno.jetpackdemo.util.LOADING_FRAGMENT_TAG

abstract class BaseFragment : Fragment() {

    var delayHandler: Handler = Handler()

    protected fun showLoadingDialog() {
        val prev = activity?.supportFragmentManager?.findFragmentByTag(LOADING_FRAGMENT_TAG)
        val newFragment: LoadingFragmentDialog

        newFragment = if (prev == null || prev !is LoadingFragmentDialog) {
            LoadingFragmentDialog()
        } else
            prev

        if (!newFragment.isAdded) {
            newFragment.isCancelable = false
            newFragment.show(activity!!.supportFragmentManager, LOADING_FRAGMENT_TAG)
        }
    }

    protected fun hideLoadingDialog() {
        val prev = activity?.supportFragmentManager?.findFragmentByTag(LOADING_FRAGMENT_TAG)

        if (prev != null && prev is LoadingFragmentDialog) {
            (prev).dismiss()
        }
    }
}