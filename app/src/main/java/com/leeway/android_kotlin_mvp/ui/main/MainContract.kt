package com.leeway.android_kotlin_mvp.ui.main

import com.leeway.android_kotlin_mvp.ui.base.MvpPresenter
import com.leeway.android_kotlin_mvp.ui.base.MvpView

/**
 * Created by Lee Lorz on 7/15/2017.
 */
interface MainContract {

    interface Presenter<V:MainContract.View>: MvpPresenter<V> {

    }

    interface View: MvpView {

    }
}