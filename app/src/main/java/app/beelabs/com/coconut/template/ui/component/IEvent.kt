package app.beelabs.com.coconut.template.ui.component

import android.content.Context
import android.widget.TextView

interface IEvent {
    fun setupEvent(context: Context)

    fun showLabelManager(label: String, labelTextView: TextView, context: Context)
}