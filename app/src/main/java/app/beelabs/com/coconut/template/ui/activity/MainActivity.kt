package app.beelabs.com.coconut.template.ui.activity

import android.os.Bundle
import app.beelabs.com.coconut.template.R
import app.beelabs.com.codebase.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
