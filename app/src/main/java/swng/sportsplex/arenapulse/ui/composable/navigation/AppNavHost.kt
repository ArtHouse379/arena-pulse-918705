package swng.sportsplex.arenapulse.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import swng.sportsplex.arenapulse.ui.composable.screen.bookings.BXATBookingsScreen
import swng.sportsplex.arenapulse.ui.composable.screen.checkout.BXATCheckoutScreen
import swng.sportsplex.arenapulse.ui.composable.screen.home.BXATHomeScreen
import swng.sportsplex.arenapulse.ui.composable.screen.onboarding.BXATOnboardingScreen
import swng.sportsplex.arenapulse.ui.composable.screen.servicedetails.BXATServiceDetailsScreen
import swng.sportsplex.arenapulse.ui.composable.screen.settings.BXATSettingsScreen
import swng.sportsplex.arenapulse.ui.composable.screen.splash.BXATSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            BXATSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            BXATOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            BXATHomeScreen(
                onNavigateToServiceDetails = { serviceId: Int ->
                    navController.navigate(
                        route = NavRoute.ServiceDetails(serviceId = serviceId)
                    )
                }
            )
        }

        composable<NavRoute.ServiceDetails> { backStackEntry ->
            val serviceDetails: NavRoute.ServiceDetails = backStackEntry.toRoute()
            BXATServiceDetailsScreen(
                serviceId = serviceDetails.serviceId,
                onNavigateToCheckout = { serviceId: Int ->
                    navController.navigate(
                        route = NavRoute.Checkout(serviceId = serviceId)
                    )
                }
            )
        }

        composable<NavRoute.Checkout> { backStackEntry ->
            val checkout: NavRoute.Checkout = backStackEntry.toRoute()
            BXATCheckoutScreen(
                serviceId = checkout.serviceId,
                onNavigateToBookingsScreen = {
                    navController.navigate(NavRoute.Bookings) {
                        popUpTo(NavRoute.Home) {
                            inclusive = false
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Bookings> {
            BXATBookingsScreen()
        }

        composable<NavRoute.Settings> {
            BXATSettingsScreen()
        }
    }
}