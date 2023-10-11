package com.example.capstoneproject

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.capstoneproject.DataModel.DataManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Content() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth(0.7f),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ){
                Text(text = "Patna",
                    style = TextStyle(
                        fontSize = 24.sp,
                        textAlign = TextAlign.Start
                    )
                    )
                Text(text = "We are a family owned Mediterranean restaurant, focused on traditional recipes served with a modern twist.",
                    style = TextStyle(
                        fontSize = 18.sp,
                        textAlign = TextAlign.Start
                    )
                    )
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(painter = painterResource(id =R.drawable.resturant ), contentDescription = "",
                    modifier = Modifier
                        .padding(2.dp)
                        .size(120.dp)
                        .border(BorderStroke(1.dp, Color.Black))
                        .background(Color.White),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.CenterEnd
                )
            }
        }
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Search") },
            leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .paddingFromBaseline(10.dp)
        )
        DataManager.datatext = text
    }
}