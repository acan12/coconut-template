package app.beelabs.com.coconut.template.ui.component.impl

import android.content.Intent

interface INavigation : IBaseNavigation {
    fun homeNavigation(intent: Intent): IHomeNavigation
}