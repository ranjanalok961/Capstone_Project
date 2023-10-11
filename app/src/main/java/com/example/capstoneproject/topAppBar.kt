package com.example.capstoneproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppView() {
    TopAppBar(
        title = {
            Text(text = "Food App",
                modifier = Modifier
                    .fillMaxWidth(),
                style = TextStyle(
                    fontSize = 32.sp,
                    fontStyle = FontStyle.Italic,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray, RectangleShape),
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description"
                )
            }
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Localized description"
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.LightGray
        )
    )
}