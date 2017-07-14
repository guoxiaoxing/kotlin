package com.guoxiaoxing.eyepetizer.api

import com.guoxiaoxing.eyepetizer.model.data.Home
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午3:46
 */
interface ApiService {

    companion object {
        val BASE_URL: String
            get() = "http://baobab.kaiyanapp.com/api/"
    }

    @GET("v2/feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun queryHomeData(): Observable<Home>

}