package com.example.careiroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.home.ui.HomeView
import com.example.careiroapp.navigation.AppNavHost
import com.example.careiroapp.ui.theme.CareiroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CareiroAppTheme {
                AppNavHost(
                    navController = rememberNavController()
                )
            }
        }
    }
}
