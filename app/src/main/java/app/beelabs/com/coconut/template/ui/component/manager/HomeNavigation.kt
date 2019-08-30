package app.beelabs.com.coconut.template.ui.component.manager

import android.content.Context
import android.content.Intent
import app.beelabs.com.coconut.template.ui.component.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {
    override fun goSecondPage(txt: String, context: Context) {
        val intent = Intent()
        context.startActivity(intent)
    }

}