package com.guoxiaoxing.eyepetizer.presenter

import android.content.Context
import com.guoxiaoxing.eyepetizer.interfaces.contract.HomeContract

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午3:07
 */
class HomePresenter constructor(context: Context, view: HomeContract.View) : HomeContract.Presenter {

    var mContext: Context? = null
    var mView: HomeContract.View? = null


    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun queryData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}