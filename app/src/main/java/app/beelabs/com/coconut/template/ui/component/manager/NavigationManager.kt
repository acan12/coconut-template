package app.beelabs.com.coconut.template.ui.component.manager

import android.content.Intent
import app.beelabs.com.coconut.template.App
import app.beelabs.com.coconut.template.ui.component.impl.IHomeNavigation
import app.beelabs.com.coconut.template.ui.component.impl.INavigation

class NavigationManager : INavigation {
    override fun homeNavigation(intent: Intent): IHomeNavigation {
        return App.uiComponent?.inject(HomeNavigation())!!
    }
}