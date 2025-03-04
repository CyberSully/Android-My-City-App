package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import data.Datasource
import model.Place

// Brett Sullivan - Sullbret@oregonstate.edu
// CS 492 - Mobile App Development - My City App
// 2-10-2025

@Composable
fun RecommendationListScreen(navController: NavController, categoryName: String) {
    val category = Datasource().getCategories().find { it.name == categoryName }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFD7C4F0))
        .padding(16.dp)) {

        // Back Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
        }

        Text(text = "Recommendations for $categoryName", style = MaterialTheme.typography.headlineMedium)

        LazyColumn {
            items(category?.places ?: emptyList()) { place ->
                RecommendationItem(place) {
                    navController.navigate("detail/${place.name}/${place.address}/${place.description}/${place.imageResId}")
                }
            }
        }
    }
}

@Composable
fun RecommendationItem(place: Place, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() },
        shape = MaterialTheme.shapes.medium
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = place.name, style = MaterialTheme.typography.titleLarge)
        }
    }
}
