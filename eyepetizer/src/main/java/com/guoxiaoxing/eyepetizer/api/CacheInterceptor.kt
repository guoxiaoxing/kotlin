package com.guoxiaoxing.eyepetizer.api

import android.content.Context
import android.util.Log
import com.guoxiaoxing.eyepetizer.util.NetworkUtils
import okhttp3.CacheControl
import okhttp3.Interceptor
import okhttp3.Response

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午4:32
 */
class CacheInterceptor(context: Context) : Interceptor {
    val context = context
    override fun intercept(chain: Interceptor.Chain?): Response? {
        var request = chain?.request()
        if (NetworkUtils.isConnected(context)) {
            val response = chain?.proceed(request)
            // read from cache for 60 s
            val maxAge = 60
            val cacheControl = request?.cacheControl().toString()
            Log.e("CacheInterceptor", "6s load cahe" + cacheControl)
            return response?.newBuilder()?.removeHeader("Pragma")?.removeHeader("Cache-Control")?.header("Cache-Control", "public, max-age=" + maxAge)?.build()
        } else {
            Log.e("CacheInterceptor", " no network load cahe")
            request = request?.newBuilder()?.cacheControl(CacheControl.FORCE_CACHE)?.build()
            val response = chain?.proceed(request)
            //set cahe times is 3 days
            val maxStale = 60 * 60 * 24 * 3
            return response?.newBuilder()?.removeHeader("Pragma")?.removeHeader("Cache-Control")?.header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)?.build()
        }
    }

}