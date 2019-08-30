package app.beelabs.com.coconut.template.ui.component

import app.beelabs.com.coconut.template.ui.component.module.EventModule
import app.beelabs.com.coconut.template.ui.component.scope.SupportScope
import com.pede.emoney.ui.component.module.LogicUIModule
import dagger.Subcomponent

@SupportScope
@Subcomponent(modules = [LogicUIModule::class, EventModule::class])
interface SupportSubComponent {

    fun inject(logic: ILogic): ILogic
    fun inject(event: IEvent): IEvent
}