package com.example.lab_exam

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OverviewScreen(navController: NavController){

//    var userData by remember mutableStateOf(userData())

    Scaffold(Modifier.padding(10.dp) , topBar = {
        TopAppBar(
            title = {
                Text(text = "My Bank")
            },
            actions = {
                IconButton(onClick = { /* Do something */ }) {
                    Icon(Icons.Filled.Star, contentDescription = "Add")
                }
            }
        )
    }, floatingActionButton = {
        FloatingActionButton(onClick = { navController.navigate(route = "addtransaction_screen") }) {
            Icon(Icons.Filled.Add, contentDescription = "Add")
        }
    }) {
        Box(modifier = Modifier.padding(it), ) {
            Column( modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)){

                Column (modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .background(color = Color.LightGray), verticalArrangement = Arrangement.Center,
                    ){
                    Row(modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Income")
                        Icon(Icons.Default.KeyboardArrowUp, contentDescription = "icon")
                    }
                    Text(text = "2000")
                }


                Column (modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .background(color = Color.LightGray), verticalArrangement = Arrangement.Center){
                    Row (modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Expenses")
                        Icon(Icons.Default.KeyboardArrowUp, contentDescription = "icon")
                    }
                    Text(text = "2000")
                }

                Column (modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .background(color = Color.Blue), verticalArrangement = Arrangement.Center){
                    Row (modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Total")
                        Icon(Icons.Default.KeyboardArrowUp, contentDescription = "icon")
                    }
                    Text(text = "2000", color = Color.White)
                }

                Spacer(modifier = Modifier.height(10.dp))
                Text(text = " Last Transactions", modifier = Modifier.padding(10.dp), color = Color.Black, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = "Description", color = Color.Black)
                    Text(text = "Amounts" ,color = Color.Black)
                    Text(text = "Data", color = Color.Black)
                    Text(text = "Icon", color = Color.Black)
                }
                LazyVerticalGrid(columns = GridCells.Fixed(4), modifier = Modifier){
                    items(10){
                        Row(){

                        }
                    }

                }


            }
        }
    }

}




