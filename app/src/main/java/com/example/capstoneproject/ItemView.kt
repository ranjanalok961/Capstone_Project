package com.example.capstoneproject

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.capstoneproject.DataModel.DataManager
import com.example.capstoneproject.DataModel.Item
import com.example.capstoneproject.DataModel.itemList

@Composable
fun ItemView() {
    val selectitem : List<Item> = itemList.filter{
        if (DataManager.selectcategory.isEmpty() && DataManager.datatext.isEmpty()) {
            true
        }else if(DataManager.selectcategory.isEmpty() && !(DataManager.datatext.isEmpty())){
            it.name == DataManager.datatext
        }else if(!(DataManager.selectcategory.isEmpty()) && DataManager.datatext.isEmpty()){
            it.category==DataManager.selectcategory
        }else{
            it.category==DataManager.selectcategory
            it.name.contains(DataManager.datatext , ignoreCase = true)
        }
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        content = {
            items(selectitem) { data ->
                MenuList(data)
            }
        }
    )
}

@Composable
fun MenuList(data: Item) {
    Card (
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(100.dp)
            .background(Color.White, shape = RoundedCornerShape(10)),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp,
            hoveredElevation = 30.dp,
            focusedElevation = 30.dp
        ),
        colors = CardDefaults.elevatedCardColors(
            containerColor = Color.White
        )
    ){
        Row (
            modifier = Modifier
                .fillMaxSize(1f)
                .background(Color.White)
        ){
            Column (
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(0.7f),
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = data.name ,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 18.sp
                    )
                )
                Text(text = "${data.cost_inr}",
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
            Column (
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ){
                Image(painter = painterResource(id =data.imageResource ), contentDescription = "",
                    modifier = Modifier
                        .padding(5.dp)
                        .size(100.dp)
                        .border(BorderStroke(1.dp, Color.Black))
                        .background(Color.White),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.CenterEnd
                )
            }
        }
    }
}