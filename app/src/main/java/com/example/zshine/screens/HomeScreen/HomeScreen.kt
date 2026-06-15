package com.example.zshine.screens.HomeScreen

import android.location.Location
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zshine.R
import com.example.zshine.modle.Product
import com.example.zshine.screens.UiComponents.MyBottomNevBar


@Preview(showBackground = true,showSystemUi = true)
@Composable
fun HomeScreen () {
val location= "Shaheen Bagh,Delhi"

   Scaffold(
       bottomBar = { MyBottomNevBar() }
   ) { innerPadding ->

       Box(
           modifier = Modifier
               .fillMaxWidth()
               .fillMaxHeight(1f / 3f)
               .background(
                   brush = Brush.linearGradient(
                       colors = listOf(
                           Color(0xFF642463),
                           Color(0xFF782B77),
                           Color(0xffAA3CA9
                           )
                       )
                   )
               )
       )
       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding( 16.dp)
               .padding(innerPadding)
       ) {

           Text(
               text = "Location",
               color = Color.Gray,
               fontSize = 16.sp,

           )
           Spacer(modifier = Modifier.height(6.dp))
           Row(
               verticalAlignment = Alignment.CenterVertically,
           ) {
               Text(text =location,
                   color = Color.White,
                   fontSize = 24.sp,
                   fontWeight = FontWeight.SemiBold)
               Icon(imageVector = Icons.Default.KeyboardArrowDown,
                   contentDescription = "Drop Down Arrow",
                   tint = Color.White)
           }
           Spacer(modifier = Modifier.height(40.dp))

           MySearchBar()

           val products = listOf(
               Product(1, "Product 1", "Description 1", 10.0, R.drawable.product1)
               ,Product(2, "Product 2", "Description 2", 20.0, R.drawable.product2)
               ,Product(3, "Product 3", "Description 3", 30.0, R.drawable.product3)
               ,Product(4, "Product 4", "Description 4", 40.0, R.drawable.product4)
               ,Product(5, "Product 5", "Description 5", 50.0, R.drawable.product5)
               ,Product(6, "Product 6", "Description 6", 60.0, R.drawable.product6)
               ,Product(7, "Product 7", "Description 7", 70.0, R.drawable.product7)
               ,Product(8, "Product 8", "Description 8", 80.0, R.drawable.product8)

           )
           ProductGrid(products = products)

       }
       BannerList()
       HomeScreenCategories()





   }
}

