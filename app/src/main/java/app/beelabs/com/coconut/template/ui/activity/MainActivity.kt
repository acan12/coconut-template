package app.beelabs.com.coconut.template.ui.activity

import android.os.Bundle
import app.beelabs.coconut.mvvm.base.BaseActivity
import app.beelabs.com.coconut.template.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
