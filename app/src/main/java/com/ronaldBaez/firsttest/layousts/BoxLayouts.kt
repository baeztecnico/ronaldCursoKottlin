package com.ronaldBaez.firsttest.layousts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayou(){
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
        .fillMaxSize()

    ){
        Box(
            modifier = Modifier.size(100.dp)
        ){

        }
    }
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()

    ){
        Box(
            modifier = Modifier.size(100.dp)
        ){

        }
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()

    ){
        Box(
            modifier = Modifier.size(100.dp)
        ){

        }
    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()

    ){
        Box(
            modifier = Modifier.size(100.dp)
        ){

        }
    }
    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()

    ){
        Box(
            modifier = Modifier.size(100.dp)
        ){

        }
    }
}