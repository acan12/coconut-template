package app.beelabs.com.coconut.template.presenter.manager

import android.content.Context
import app.beelabs.com.coconut.template.IConfig
import app.beelabs.com.codebase.support.util.CacheUtil

object SessionManager {

    fun putSessionLogin(isLogin: Boolean, context: Context) {
        CacheUtil.putPreferenceBoolean(IConfig.SESSION_LOGIN_KEY, isLogin, context)
    }

    fun clearSessionLogin(context: Context) {
        CacheUtil.putPreferenceBoolean(IConfig.SESSION_LOGIN_KEY, false, context)
        CacheUtil.putPreferenceString(IConfig.SESSION_TOKEN_CREDENTIAL, "", context)
    }

    fun isLogin(context: Context): Boolean {
        return CacheUtil.getPreferenceBoolean(IConfig.SESSION_LOGIN_KEY, context)!!
    }

    fun putCredential(token: String, context: Context) {
        CacheUtil.putPreferenceString(IConfig.SESSION_TOKEN_CREDENTIAL, token, context)
    }

    fun getCredential(context: Context): String {
        val token = CacheUtil.getPreferenceString(IConfig.SESSION_TOKEN_CREDENTIAL, context)
        return token ?: ""
    }
}
