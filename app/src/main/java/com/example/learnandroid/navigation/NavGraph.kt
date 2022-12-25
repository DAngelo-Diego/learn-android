package com.example.learnandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.learnandroid.presentation.screen.home.HomeScreen
import com.example.learnandroid.presentation.screen.splash.SplashScreen
import com.example.learnandroid.presentation.screen.welcome.WelcomeScreen
import com.example.learnandroid.util.Constants.INFO_ID_DETAILS_ARGUMENT_KEY
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route){
            SplashScreen(navHostController = navHostController)
        }
        composable(route = Screen.Welcome.route){
            WelcomeScreen(navHostController = navHostController)
        }
        composable(route = Screen.Home.route){
            HomeScreen(navHostController = navHostController)
        }
        composable(route = Screen.Details.route,
        arguments = listOf(navArgument(INFO_ID_DETAILS_ARGUMENT_KEY){
            type = NavType.IntType
        })
            ){

        }
        composable(route = Screen.Search.route){

        }
    }
}