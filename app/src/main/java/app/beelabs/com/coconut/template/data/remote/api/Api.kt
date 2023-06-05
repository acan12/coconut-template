package app.clappingape.com.elevaniamartpos.model.api

import android.content.Context
import app.beelabs.coconut.mvvm.base.BaseApi
import app.beelabs.coconut.mvvm.base.BaseConfig
import app.beelabs.coconut.mvvm.base.interfaces.IApiService
import app.beelabs.com.coconut.template.App
import app.beelabs.com.coconut.template.BuildConfig
import app.beelabs.com.coconut.template.IConfig
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.Interceptor
import javax.inject.Inject


open class Api @Inject constructor(private val apiService: IApiService) : BaseApi() {

    private fun initHeader(): Map<String, String> {
        val map = HashMap<String, String>()
        map["Authorization"] = ""
//            map["Cache-Control"] = ""
//            map["Content-type"] = ""
        return map
    }

    fun getNetwork(context: Context): ApiService =
        setupApiDomain(
            IConfig.API_BASE_URL,
            true,
            ApiService::class.java,
            BaseConfig.TIMEOUT_LONG_INSECOND,
            BuildConfig.DEBUG,
            interceptors = arrayOf(ChuckerInterceptor.Builder(context).build()),
            networkInterceptors = arrayOf(),
        ) as ApiService

    private fun setupApiDomain(
        apiDomain: String,
        allowUntrusted: Boolean,
        apiservice: Class<*>,
        timeoutLong: Long,
        enableLogging: Boolean,
        interceptors: Array<Interceptor>,
        networkInterceptors: Array<Interceptor>
    ): Any {
        return apiService.initApiService(
            apiDomain,
            allowUntrusted,
            apiservice,
            timeoutLong,
            enableLogging,
            interceptors,
            networkInterceptors
        )
    }
}