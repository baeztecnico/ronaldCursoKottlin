package com.ronaldBaez.firsttest.layousts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScafolLayout(){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ),
                title = {

                Text(
                    text ="App bar",
                    fontSize = 32.sp

                )
            })
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Magenta,
                shape = CircleShape,
                onClick = {}) {
            Text(
                text ="+",
                fontSize = 32.sp

                )
        }}
    ) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
            .background(color = Color.Red)
            .fillMaxSize()

        ){
            Column {
                ItemContact("Rony Stark","3132269648")
                ItemContact("Rony Stark","3132269648")
                ItemContact("Rony Stark","3132269648")
                ItemContact("Rony Stark","3132269648")


            }

        }
    }
}

@Composable
fun ItemContact(name: String, phoneNumbe: String){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(16.dp)

    ){
        Text(
            text =name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text =phoneNumbe,
            fontSize = 12.sp,
            fontWeight = FontWeight.Thin,
            color = Color.DarkGray
        )
    }
}