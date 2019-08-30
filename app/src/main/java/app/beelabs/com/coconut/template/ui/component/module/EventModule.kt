package app.beelabs.com.coconut.template.ui.component.module

import app.beelabs.com.coconut.template.ui.component.manager.EventManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import app.beelabs.com.coconut.template.ui.component.IEvent as IEvent1

@Module
class EventModule {

    @Singleton
    @Provides
    fun provideEvent(): IEvent1 {
        return EventManager()
    }


}