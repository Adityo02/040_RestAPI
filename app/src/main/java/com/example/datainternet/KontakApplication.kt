package com.example.datainternet

import android.app.Application
import com.example.datainternet.repository.AppContainer
import com.example.datainternet.repository.KontakContainer

class KontakApplication : Application(){
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}