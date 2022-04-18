package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.UserComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.splash.SplashComponent
import dagger.Module

@Module(
    subcomponents = [
        RegistrationComponent::class,
        LoginComponent::class,
        UserComponent::class,
        SplashComponent::class])
class AppSubcomponents {
}