package com.example.zshine.screens.HomeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true, showSystemUi = true)
@Composable
 fun
        HomeScreenCategories () {

            val Categories = listOf( "All Jewelry", "Rings", "Earrings",
                "Necklaces", "Bracelets", "Pendants", "Mangalsutras")
    var selectedCategory by remember { mutableStateOf(Categories.first()) }
    LazyRow(
        modifier = Modifier.padding(top = 370.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp)

    ){
        items(Categories){category ->
            CategoryChip(text = category, isSelected = category == selectedCategory,
                onSelected = {selectedCategory= category})
        }
        }
    }


