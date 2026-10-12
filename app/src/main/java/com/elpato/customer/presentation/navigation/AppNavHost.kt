package com.elpato.customer.presentation.navigation
import androidx.compose.runtime.Composable; import androidx.hilt.navigation.compose.hiltViewModel; import androidx.navigation.NavHostController; import androidx.navigation.compose.NavHost; import androidx.navigation.compose.composable; import com.elpato.customer.presentation.home.HomeScreen
@Composable fun AppNavHost(nav: NavHostController) { NavHost(nav, "home") { composable("home") { HomeScreen(onBranchSelect = { nav.navigate("menu/$it") }) } } }
