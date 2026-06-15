package com.example.zshine.screens.UiComponents

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zshine.R
import com.example.zshine.ui.theme.LightdarkPurple
import com.example.zshine.ui.theme.lightPurple

@Preview
@Composable
fun MyBottomNevBar() {
    val navItems = listOf(
        NavItem(title = "Home",R.drawable.home),
        NavItem(title = "Cart",R.drawable.cart),
        NavItem(title = "Favourites",R.drawable.heart),
        NavItem(title = "Profile",R.drawable.user)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(60.dp)
    ) {
        navItems.forEachIndexed {index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(text = item.title)
                },
                modifier = Modifier.size(20.dp),
                selected = true,
                onClick = { /*TODO*/ },
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightdarkPurple,
                    selectedTextColor = LightdarkPurple,
                    indicatorColor = MaterialTheme.colorScheme.surface,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                )

            )


        }
        }
    }


data class NavItem(
    val title: String,
    val icon: Int
)