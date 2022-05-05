package app.beelabs.com.coconut.template

import app.beelabs.com.codebase.base.BaseApp
import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.codebase.di.component.DaggerAppComponent

class App : BaseApp() {

    companion object {

        fun getAppComponent(): AppComponent? {
            return getComponent()
        }


//        fun getHomeNavigationComponent(): IHomeNavigation {
//            return uiComponent?.inject(HomeNavigation())!!
//        }
    }

    override fun onCreate() {
        super.onCreate()

        setupBuilder(DaggerAppComponent.builder(), this)
        setupDefaultFont("font/Avenir-Medium.ttf")
    }

}