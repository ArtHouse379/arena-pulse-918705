package swng.sportsplex.arenapulse.di

import swng.sportsplex.arenapulse.data.repository.BookingRepository
import swng.sportsplex.arenapulse.data.repository.OnboardingRepository
import swng.sportsplex.arenapulse.data.repository.ServiceRepository
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        OnboardingRepository(
            onboardingDataStoreManager = get(),
            coroutineDispatcher = get(DispatchersQualifiers.IO)
        )
    }

    single { ServiceRepository() }

    single {
        BookingRepository(
            bookingDao = get(),
            coroutineDispatcher = get(DispatchersQualifiers.IO)
        )
    }
}