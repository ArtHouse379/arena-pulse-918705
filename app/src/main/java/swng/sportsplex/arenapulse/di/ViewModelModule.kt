package swng.sportsplex.arenapulse.di

import swng.sportsplex.arenapulse.ui.viewmodel.BookingViewModel
import swng.sportsplex.arenapulse.ui.viewmodel.CheckoutViewModel
import swng.sportsplex.arenapulse.ui.viewmodel.OnboardingViewModel
import swng.sportsplex.arenapulse.ui.viewmodel.ServiceDetailsViewModel
import swng.sportsplex.arenapulse.ui.viewmodel.ServiceViewModel
import swng.sportsplex.arenapulse.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ServiceViewModel(
            serviceRepository = get()
        )
    }

    viewModel {
        ServiceDetailsViewModel(
            serviceRepository = get()
        )
    }

    viewModel {
        BookingViewModel(
            bookingRepository = get(),
            serviceRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            bookingRepository = get(),
        )
    }
}