package com.example.capstoneproject

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.capstoneproject.DataModel.DataManager
import com.example.capstoneproject.DataModel.itemList


@Composable
fun CategoryView() {
    var categories = listOf<String>()
    categories = itemList.filter {
        true
    }.map { it.category }
    LazyHorizontalGrid(rows = GridCells.Fixed(1),
        modifier = Modifier.height(55.dp)
    ){
        items(categories.distinct()){data ->
            Categroy(data)
        }
    }
}

@Composable
fun Categroy(data: String) {
    var isHovered by remember { mutableStateOf(false) }
    var drawableRes by remember { mutableStateOf(R.drawable.stacked_waves_haikei) }
    Box(
        modifier = Modifier
            .clickable {
                if(drawableRes ==R.drawable.stacked_waves_haikei){
                    drawableRes = R.drawable.wave2
                }else{
                    drawableRes =R.drawable.stacked_waves_haikei
                }
                if(DataManager.selectcategory ==data){
                    DataManager.selectcategory = ""

                }else{
                    DataManager.selectcategory = data
                }
            }
            .padding(8.dp)
            .size(100.dp, 50.dp)  // Adjust the size as needed
            .clip(
                RoundedCornerShape(10)
            )
            .paint(
                contentScale = ContentScale.Crop,
                painter = painterResource(  id = drawableRes)
            )
        ,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = data,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}