package ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import data.Datasource
import model.Category

// Brett Sullivan - Sullbret@oregonstate.edu
// CS 492 - Mobile App Development - My City App
// 2-10-2025

@Composable
fun CategoryListScreen(navController: NavController) {
    val categories = Datasource().getCategories()

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(categories) { category ->
            CategoryItem(category) {
                navController.navigate("recommendations/${category.name}") // Navigate to Recommendation List
            }
        }
    }
}

@Composable
fun CategoryItem(category: Category, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() },
        shape = MaterialTheme.shapes.medium
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = category.name, style = MaterialTheme.typography.titleLarge)
        }
    }
}

