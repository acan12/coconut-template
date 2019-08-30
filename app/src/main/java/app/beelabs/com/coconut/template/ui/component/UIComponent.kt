package app.beelabs.com.coconut.template.ui.component

import app.beelabs.com.coconut.template.ui.component.impl.IHomeNavigation
import app.beelabs.com.coconut.template.ui.component.impl.INavigation
import app.beelabs.com.coconut.template.ui.component.module.NavModule
import app.beelabs.com.codebase.di.component.AppComponent
import com.pede.emoney.ui.component.scope.UIScope
import dagger.Component

@UIScope
@Component(modules = [NavModule::class], dependencies = [AppComponent::class])
interface UIComponent {
    fun inject(iNavigation: INavigation): INavigation
    fun inject(iHomeNavigation: IHomeNavigation): IHomeNavigation

    fun newSupportSubcomponent() : SupportSubComponent
}

