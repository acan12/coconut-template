package app.beelabs.com.coconut.template

import android.content.Context
import app.beelabs.com.codebase.base.BaseApp
import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.codebase.di.component.DaggerAppComponent

class App : BaseApp() {

    companion object {
        var context: Context? = null
        fun getAppComponent(): AppComponent? {
            if (context == null) return null
            return getComponent()
        }
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        setupBuilder(DaggerAppComponent.builder(), this)
        setupDefaultFont("font/Avenir-Medium.ttf")

    }

}