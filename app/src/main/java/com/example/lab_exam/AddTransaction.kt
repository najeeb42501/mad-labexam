package com.example.lab_exam

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTransaction(navController: NavController) {



    Scaffold(Modifier.padding(10.dp) , topBar = {
        TopAppBar(
            title = {
                Text(text = "My Bank")
            },
            actions = {
                IconButton(onClick = { navController.navigate(route = "overview_screen") }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "back")
                }
            }
        )
    }, bottomBar = {
        Button( modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }) {
            Text(text = "Add Transaction")

        }
    }) {
        Box(modifier = Modifier
            .padding(it)
            .background(color = Color.White)) {

            Column(modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
                .background(color = Color.White)) {
                TextField(value = "", onValueChange ={} ,label = { Text(text = "Title") } )
                TextField(value = "", onValueChange = {} , label = { Text(text = "Amount") })
                TextField(value = "", onValueChange = {}, label = { Text(text = "Transaction Type") } )
                TextField(value = "", onValueChange = {}, label = { Text(text = "Reason")

                } )
            }
        }

        }

    }






