package com.example.zshine.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zshine.R
import com.example.zshine.modle.Product
import com.example.zshine.ui.theme.LightdarkPurple
import com.example.zshine.ui.theme.PurpleGrey80
import com.example.zshine.ui.theme.lightPurple


@Composable
fun ProductCard (
    products: Product,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0XFFF4DFF3).copy(alpha = 0.5f)),
            elevation= CardDefaults.cardElevation(defaultElevation = 6.dp)


    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)

            ){
                Image(painter = painterResource( products.imageRes),
                    contentDescription = "Product Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                        .clip(RoundedCornerShape(24.dp)))
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = products.name,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = products.description,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.Gray),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) { Text(
                text = "$${products.price}",
                style = MaterialTheme.typography.titleMedium.copy(
                    color = LightdarkPurple,
                    fontWeight = FontWeight.Bold
                )
            )
                IconButton(onClick = {},
                    modifier = Modifier.background(
                        color = lightPurple,
                        shape = RoundedCornerShape(10.dp)
                    )) {
                    Icon(imageVector = Icons.Default.Add
                    , contentDescription = "Add To Cart",
                        tint = Color.White)
                }


            }


        }
    }
}