package com.pede.emoney.ui.component.module

import app.beelabs.com.coconut.template.ui.component.impl.IAnimationLogic
import app.beelabs.com.coconut.template.ui.component.impl.IPaymentLogic
import app.beelabs.com.coconut.template.ui.component.manager.AnimationLogicManager
import app.beelabs.com.coconut.template.ui.component.manager.PaymentLogicManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LogicUIModule {

    @Singleton
    @Provides
    fun providePaymentLogic(): IPaymentLogic {
        return PaymentLogicManager()
    }

    @Singleton
    @Provides
    fun provideAnimationLogic(): IAnimationLogic {
        return AnimationLogicManager()
    }
}