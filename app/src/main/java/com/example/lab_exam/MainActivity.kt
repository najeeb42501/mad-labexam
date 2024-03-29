package com.example.lab_exam

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab_exam.ui.theme.LabexamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LabexamTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}





@Composable
fun MyApp(){

    val navController = rememberNavController()

    SplashScreen(navController = navController)


    NavHost(navController = navController, startDestination = "splash_screen" ){

        composable("splash_screen"){
            SplashScreen(navController)
        }
        composable("overview_screen"){
           OverviewScreen(navController)
        }
        composable("addtransaction_screen"){
             AddTransaction(navController)
        }

    }
}




@Composable
fun SplashScreen(navController: NavController) {
    val delay = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        delay.animateTo(1f, animationSpec = tween(3000))
        navController.navigate("overview_screen")
    }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.logo ), contentDescription = "App Logo" )
        Text(text = "LOLO BANK ")
    }
}
