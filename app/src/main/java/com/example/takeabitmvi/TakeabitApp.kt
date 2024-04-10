package com.example.takeabitmvi

import android.app.Application
import androidx.compose.runtime.Composable
import com.example.takeabitmvi.core.TakeabitMVITheme
import com.example.takeabitmvi.view.home.HomeView
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TakeabitApplication : Application()

@Composable
fun TakeabitApp() {
    TakeabitMVITheme {
        HomeView()
    }
}