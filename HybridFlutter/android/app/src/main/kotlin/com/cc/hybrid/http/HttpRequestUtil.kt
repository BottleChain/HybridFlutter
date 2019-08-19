package com.cc.hybrid.http

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Created by zhouwenliang on 2018/4/24.
 * Http访问的接口类
 */
internal object HttpRequestUtil {
    private val TAG = "HttpRequestUtil"

    var okHttpClient: OkHttpClient
    init {
        val builder = OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
        okHttpClient = builder.build()
    }


}