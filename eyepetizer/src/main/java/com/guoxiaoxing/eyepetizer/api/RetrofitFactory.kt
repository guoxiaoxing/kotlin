package com.guoxiaoxing.eyepetizer.api

import android.content.Context
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午4:10
 */
class RetrofitFactory constructor(context: Context, baseUrl: String) {

    val DEFAULT_TIMEOUT: Long = 20

    var httpCacheDirectory: File? = null
    val mContext: Context = context
    var cache: Cache? = null
    var okhttpClient: OkHttpClient? = null
    var retrofit: Retrofit? = null
    var url = baseUrl

    init {
        if (httpCacheDirectory == null) {
            httpCacheDirectory = File(mContext.cacheDir, "app_cache")
        }

        if (cache == null) {
            cache = Cache(httpCacheDirectory, 10 * 1024 * 1024)
        }

        okhttpClient = OkHttpClient.Builder()
                .cache(cache)
                .addInterceptor(CacheInterceptor(context))
                .addNetworkInterceptor(CacheInterceptor(context))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build()

        retrofit = Retrofit.Builder()
                .client(okhttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()
    }

    companion object {
        @Volatile
        lateinit var instance: RetrofitFactory

        fun getInstance(context: Context, baseUrl: String): RetrofitFactory {
            synchronized(RetrofitFactory::class) {
                instance = RetrofitFactory(context, baseUrl)
            }
            return instance
        }
    }

    fun <T> create(service: Class<T>): T? {
        return retrofit?.create(service)
    }

}