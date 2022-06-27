package com.example.android.dagger.splash

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.user.UserManager
import javax.inject.Inject

@ActivityScope
class SplashViewModel @Inject constructor(private val userManager: UserManager) {

    var isRegistered = userManager.isUserRegistered()
    var isLoggedIn = userManager.isUserLoggedIn()

}