//package com.example.tastemade
//
//import androidx.compose.foundation.Image
//import androidx.xs.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.Button
//import androidx.compose.material3.Card
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.NavType
//import androidx.navigation.Navigation
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navArgument
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//
//fun MainView  {
//    val navController = rememberNavController()
//    NavHost{
//           composable("breakfast") {
//            RecipeView(recipes = breakfastRecipes)
//        }
//        composable("lunch") {
//            RecipeView(recipes = lunchRecipes)
//        }
//        composable("dinner") {
//            RecipeView(recipes = dinnerRecipes)
//        }
//
//    }
//
//
//
//fun RecipeView(recipes: List<Recipe>){
//    var recipes: ArrayList<Recipe>
//Modifier.scrollable{
//Column(spacing: 20){
//LazyColumn(recipes){
//recipein in
//NavHost(destination: RecipeDetailsView(recipe: recipe)){
//Column{
//Image(recipe.imageName))Text(recipe.name))
//}
//}
//}
//}
//}
//}
//
//fun RecipeDetailsView(recipe: Recipe){
//
//var recipes: List<Recipe>
//Column{
//Image(painterResource(recipe.imageResId), contentDescription = null)
//Text(recipe.name)
//Text("Ingredients: ${recipe.ingredients}")
//
//    Spacer()
//}
//}
//
//
//data class Recipe(
//    val name: String,
//    val ingredients: String,
//    val imageResId: Int
//)
//
//
//
//var breakfastRecipes =arrayListOf(
//    Recipe(name:"Omelette",ingredients:"Eggs, Salt, Pepper, Cheese",imageName:"omelette"),Recipe(name:"Pancakes",ingredients:"Flour, Milk, Eggs, Sugar, Butter",imageName:"pancakes"),Recipe(name:"Avocado Toast",ingredients:"Banana, Spinach, Yogurt, Almond Milk",imageName:"Avocado_Toast"),Recipe(name:"Scrambled Eggs",ingredients:"Eggs, Salt, Pepper, Milk,Butter",imageName:"Scrambled_Eggs"),Recipe(name:"Fruit Parfait",ingredients:"Yogurt, Granola, Mixed Berries, Honey",imageName:"Fruit_Parfait")
//)
//var lunchRecipes =arrayListOf(
//    Recipe(name:"Chicken Salad",ingredients:"Chicken, Lettuce, Tomatoes, Cucumbers",imageName:"chicken_salad"),Recipe(name:"Caprese Sandwich",ingredients:"Bread, Tomatoes, Mozzarella, Basil, Balsamic Glaze",imageName:"Caprese_Sandwich"),Recipe(name:"Quinoa Salad",ingredients:"Quinoa, Mixed Greens, Cucumber, Cherry Tomatoes, Red Onion, Feta Cheese, Dressing",imageName:"Quinoa_Salad"),Recipe(name:"Veggie Wrap",ingredients:"Tortilla, Hummus, Lettuce, Tomatoes, Cucumber, Avocado",imageName:"Veggie_Wrap"),Recipe(name:"Buddha Bowl",ingredients:"Grains, Mixed Greens, Roasted Vegetables, Avocado, Tofu, Dressing",imageName:"Buddha_Bowl"),Recipe(name:"Tomato Soup",ingredients:"Tomatoes, Onion, Garlic, Vegetable Broth, Cream, Basil, Croutons",imageName:"Tomato_Soup")
//)
//var dinnerRecipes = arrayListOf(
//    Recipe(name:"Spaghetti Bolognese",ingredients:"Spaghetti, Ground Beef, Onion, Garlic, Tomatoes, Tomato Paste, Italian Seasoning, Parmesan Cheese",imageName:"Spaghetti_Bolognese"),Recipe(name:"Grilled Salmon",ingredients:"Salmon Fillet, Lemon, Dill, Salt, Pepper",imageName:"Grilled_Salmon"),Recipe(name:"Mushroom Risotto",ingredients:"Arborio Rice, Mushrooms, Onion, Garlic, Vegetable Broth , Parmesan Cheese",imageName:"Mushroom_Risotto"),Recipe(name:"Stuffed Bell Peppers",ingredients:"Bell Peppers, Rice, Ground Beef, Onion, Garlic, Tomato Sauce, Cheese",imageName:"Stuffed_Bell_Peppers"),Recipe(name:"Teriyaki Chicken",ingredients:"Chicken Thighs, Teriyaki Sauce, Soy Sauce, Honey, Garlic, Ginger, Green Onions",imageName:"Teriyaki_Chicken"),Recipe(name:"Roasted Vegetables",ingredients:"Assorted Vegetables, Olive Oil, Salt, Pepper, Herbs",imageName:"Roasted_Vegetables")
//)
