package com.example.zshine.screens.HomeScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zshine.R

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun BannerList() {

val BannerImage = listOf(
    R.drawable.banner1,
    R.drawable.banner2,
    R.drawable.banner3,
    R.drawable.banner4)

    LazyRow(modifier = Modifier.fillMaxWidth()
        .padding(top=260.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
       )
    { items(BannerImage){image ->

        Card( modifier = Modifier.width(280.dp).height(100.dp),
            shape = RoundedCornerShape(24.dp)

        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Banner Image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop)


        }

    }

    }

}