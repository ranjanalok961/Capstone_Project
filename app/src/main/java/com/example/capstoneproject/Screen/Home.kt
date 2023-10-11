package com.example.capstoneproject.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.capstoneproject.CategoryView
import com.example.capstoneproject.Content
import com.example.capstoneproject.ItemView
import com.example.capstoneproject.TopAppView


@Composable
fun Home() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TopAppView()
        Content()
        Divider(
            modifier = Modifier.fillMaxWidth(0.95f),
            thickness = 2.dp,
            color = Color.LightGray
        )
        CategoryView()
        Divider(
            modifier = Modifier.fillMaxWidth(0.95f),
            thickness = 2.dp,
            color = Color.LightGray
        )
        ItemView()
    }
}



