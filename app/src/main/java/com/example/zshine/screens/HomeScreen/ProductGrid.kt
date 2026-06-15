package com.example.zshine.screens.HomeScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zshine.modle.Product


@Composable
fun ProductGrid(
    products: List<Product>
) {

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(top = 195.dp))  {

        items(products.chunked(2)){rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                ProductCard(
                    products = rowItems[0],
                    modifier= Modifier.weight(1f))
                if (rowItems.size == 2) {
                    ProductCard(
                        products = rowItems[1],
                        modifier = Modifier.weight(1f)
                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }


        }
    }

}