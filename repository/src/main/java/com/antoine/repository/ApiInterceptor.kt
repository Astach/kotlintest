package com.antoine.repository

import com.example.repository.BuildConfig


/**
 * Created by Antoine Promerova on 6/6/17.
 */
class ApiInterceptor : okhttp3.Interceptor {

    override fun intercept(chain: okhttp3.Interceptor.Chain?): okhttp3.Response {
        if (chain != null) {
            val original = chain.request()
            val originalHttpUrl = original.url()

            val url = originalHttpUrl.newBuilder()
                    .addQueryParameter(key, BuildConfig.API_KEY)
                    .build()

            val requestBuilder = original.newBuilder()
                    .url(url)

            val request = requestBuilder.build()
            return chain.proceed(request)
        } else {
            throw NullPointerException()
        }
    }

    companion object KEY {
        val key: String = "key"
    }

}
