package app.beelabs.com.coconut.template.ui.dialog

import android.content.Context
import android.os.Bundle
import app.beelabs.coconut.mvvm.base.BaseDialog
import app.beelabs.com.coconut.template.R

class MainDialog(context: Context, style: Int) : BaseDialog(context, style) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_main)
    }
}