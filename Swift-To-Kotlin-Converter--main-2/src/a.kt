//package com.example.test123
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            App()
//        }
//    }
//}
//
//@Composable
//fun CardItem(title: String, image: Painter) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        shape = MaterialTheme.shapes.medium,
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(
//                painter = image,
//                contentDescription = title,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .height(200.dp)
//                    .fillMaxWidth()
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = title,
//                style = MaterialTheme.typography.titleMedium,
//                textAlign = TextAlign.Center,
//                modifier = Modifier.fillMaxWidth()
//            )
//        }
//    }
//}
//
//@Composable
//fun CardList() {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//    ) {
//        Text(
//            text = "Taste Made",
//            style = MaterialTheme.typography.titleLarge,
//            textAlign = TextAlign.Center,
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
//        LazyColumn(
//            modifier = Modifier.weight(1f)
//        ) {
//            items(getCardItems()) { cardItem ->
//                CardItem(
//                    title = cardItem.title,
//                    image = painterResource(cardItem.imageResId)
//                )
//            }
//        }
//    }
//}
//
//data class CardItem(val title: String, val imageResId: Int)
//
//fun getCardItems(): List<CardItem> {
//    return listOf(
//        CardItem("Breakfast", R.drawable.breakfast),
//        CardItem("Lunch", R.drawable.lunch),
//        CardItem("Dinner", R.drawable.dinner),
//        CardItem("Smoothies", R.drawable.red),
//        CardItem("Desserts", R.drawable.dessert)
//    )
//}
//
//@Preview
//@Composable
//fun App() {
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Image(
//            painter = painterResource(R.drawable.background),
//            contentDescription = null,
//            contentScale = ContentScale.FillBounds,
//            modifier = Modifier.fillMaxSize()
//        )
//        Surface(
//            modifier = Modifier.fillMaxSize()
//        ) {
//            CardList()
//        }
//    }
//}
////