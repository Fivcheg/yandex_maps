package ru.netology.nmediamap.application

import android.app.Application
import com.yandex.mapkit.MapKitFactory
import ru.netology.nmediamap.BuildConfig.MAPKIT_API_KEY


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(MAPKIT_API_KEY)
    }
}