package com.ronaldBaez.firsttest.layousts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SaludoColumn(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 24.dp, horizontal = 8.dp)
            .fillMaxSize()
    ){
        Text(
            text ="hola",

            )
        Text(
            text ="soy Ronu",

            )
        Text(
            text ="ADios",

            )
    }

}