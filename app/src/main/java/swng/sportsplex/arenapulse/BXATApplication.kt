package swng.sportsplex.arenapulse

import android.app.Application
import swng.sportsplex.arenapulse.di.dataModule
import swng.sportsplex.arenapulse.di.dispatcherModule
import swng.sportsplex.arenapulse.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BXATApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@BXATApplication)
            modules(appModules)
        }
    }
}
