package app.clappingape.com.elevaniamartpos.model.api

import app.beelabs.com.coconut.template.App
import app.beelabs.com.coconut.template.IConfig
import app.beelabs.com.coconut.template.presenter.manager.SessionManager
import app.beelabs.com.codebase.base.BaseApi


class Api : BaseApi() {

    companion object {
        private fun initHeader(): Map<String, String> {
            val map = HashMap<String, String>()
            map["Authorization"] = SessionManager.getCredential(App.context!!)
//            map["Cache-Control"] = ""
//            map["Content-type"] = ""
            return map
        }

        @Synchronized
        private fun initApiDomain(): ApiService {
            BaseApi.getInstance().apiDomain = IConfig.API_BASE_URL
            return BaseApi.getInstance().setupApi(App.getAppComponent(), ApiService::class.java) as ApiService
        }

    }
}