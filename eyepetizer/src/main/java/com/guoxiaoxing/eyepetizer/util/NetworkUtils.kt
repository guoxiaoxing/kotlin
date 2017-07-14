package com.guoxiaoxing.eyepetizer.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午4:41
 */
object NetworkUtils {

    fun isConnected(context: Context): Boolean {
        val connectManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo: NetworkInfo? = connectManager.activeNetworkInfo
        if(networkInfo == null){
            return false
        }else{
            return networkInfo.isAvailable && networkInfo.isConnected
        }
        return false
    }

}