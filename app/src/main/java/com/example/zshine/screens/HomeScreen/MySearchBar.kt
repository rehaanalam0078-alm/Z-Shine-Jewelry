package com.example.zshine.screens.HomeScreen

import androidx.annotation.Size
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import com.example.zshine.R
import com.example.zshine.ui.theme.LightdarkPurple
import com.example.zshine.ui.theme.lightPurple

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun MySearchBar () {

     var searchText by remember { mutableStateOf("") }
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
        TextField(
            value = searchText,
            onValueChange = {searchText = it},
            placeholder = { Text(text= "Search Products", color = Color.LightGray)},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    modifier = Modifier.size(30.dp),
                    tint = Color.LightGray
                )
            },
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 0.dp,
                bottomStart = 16.dp,
                bottomEnd = 0.dp),
            singleLine = true,
            modifier = Modifier.weight(1f).height(55.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0xFF782B77),
                   focusedContainerColor = Color.White,
                focusedTextColor =Color.DarkGray,
                unfocusedTextColor = Color.LightGray)
            )

        Spacer(modifier = Modifier.width(6.dp))
        IconButton(
            onClick = {},
            modifier = Modifier
                .background(
                color = Color.White,
                shape = RoundedCornerShape( topStart = 0.dp
                    ,topEnd = 16.dp,bottomStart = 0.dp,bottomEnd = 16.dp)
            ).height(55.dp)
        ) {
            Icon(
                painter = painterResource(id =R.drawable.filter),
                    contentDescription = "Filter Icon",
               tint = LightdarkPurple,
                modifier = Modifier.size(25.dp)
            )
        }
    }

}