package app.beelabs.com.coconut.template.ui.component.impl

import android.content.Context
import app.beelabs.com.coconut.template.ui.component.ILogic

interface IPaymentLogic : ILogic {

    fun setupPayment(context: Context)
}