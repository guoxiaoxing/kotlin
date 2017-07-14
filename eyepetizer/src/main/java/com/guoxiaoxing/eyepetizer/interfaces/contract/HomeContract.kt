package com.guoxiaoxing.eyepetizer.interfaces.contract

import com.guoxiaoxing.eyepetizer.interfaces.BasePresenter
import com.guoxiaoxing.eyepetizer.interfaces.BaseView

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午2:56
 */
interface HomeContract {

    interface View : BaseView<Presenter> {
        fun setData()
    }

    interface Presenter : BasePresenter {
        fun queryData()
    }
}