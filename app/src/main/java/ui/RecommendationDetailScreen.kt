package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

// Brett Sullivan - Sullbret@oregonstate.edu
// CS 492 - Mobile App Development - My City App
// 2-10-2025

@Composable
fun RecommendationDetailScreen(
    navController: NavController,
    placeName: String,
    placeAddress: String,
    placeDescription: String,
    imageResId: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB3E5FC))
            .padding(16.dp)
    ) {
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

        Text(text = placeName, style = MaterialTheme.typography.headlineLarge)

        Image(
            painter = painterResource(id = imageResId),
            contentDescription = placeName,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(vertical = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📍 $placeAddress", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = placeDescription, style = MaterialTheme.typography.bodyLarge)
    }
}


