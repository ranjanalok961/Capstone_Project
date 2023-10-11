package com.example.capstoneproject.DataModel



import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import androidx.lifecycle.ViewModel
import com.example.capstoneproject.R


object DataManager : ViewModel(){
    var selectcategory by  mutableStateOf("")
    var datatext by mutableStateOf("")
}


val itemToImageMap = mapOf(
    "Vegetable Spring Rolls" to R.drawable.springroll,
    "Paneer Tikka" to R.drawable.panertika,
    "Garlic Bread" to R.drawable.garlicbread,
    "Butter Chicken" to R.drawable.butterchicken,
    "Palak Paneer" to R.drawable.palakpaneer,
    "Dal Makhani" to R.drawable.dal_makhani,
    "Gulab Jamun" to R.drawable.gulab_jamun,
    "Kheer" to R.drawable.rice_kheer,
    "Rasmalai" to R.drawable.rasmalai,
    "Masala Chai" to R.drawable.masalchai,
    "Cold Coffee" to R.drawable.coldcoffee,
    "Fresh Lime Soda" to R.drawable.limasoda,
    "Caesar Salad" to R.drawable.casarsalad,
    "Greek Salad" to R.drawable.greeksalad,
    "Coleslaw" to R.drawable.coleslow,
    "Spaghetti Bolognese" to R.drawable.spaghetti_bolognese,
    "Alfredo Pasta" to R.drawable.alfredo_pasta,
    "Penne Arrabiata" to R.drawable.penne_arrabiata,
    "Margherita" to R.drawable.margherita,
    "Pepperoni" to R.drawable.pepperoni,
    "Vegetarian Supreme" to R.drawable.vegetarian_supreme,
    "Club Sandwich" to R.drawable.club_sandwich,
    "Grilled Cheese" to R.drawable.grilled_cheese,
    "Veggie Delight" to R.drawable.veggie_delight,
    "Chicken Biryani" to R.drawable.chicken_biryani,
    "Veg Biryani" to R.drawable.veg_biryani,
    "Hyderabadi Biryani" to R.drawable.hyderabadi_biryani,
    "Samosa" to R.drawable.samosa,
    "Pakoras" to R.drawable.pakoras,
    "French Fries" to R.drawable.french_fries
)
val itemList = mutableListOf(
    Item("Appetizers","Vegetable Spring Rolls", 150, itemToImageMap["Vegetable Spring Rolls"] ?: 0),
    Item("Appetizers","Paneer Tikka", 200, itemToImageMap["Paneer Tikka"] ?: 0),
    Item("Appetizers","Garlic Bread", 120, itemToImageMap["Garlic Bread"] ?: 0),
    Item("Main Course","Butter Chicken", 300, itemToImageMap["Butter Chicken"] ?: 0),
    Item("Main Course","Palak Paneer", 250, itemToImageMap["Palak Paneer"] ?: 0),
    Item("Main Course","Dal Makhani", 180, itemToImageMap["Dal Makhani"] ?: 0),
    Item("Desserts","Gulab Jamun", 100, itemToImageMap["Gulab Jamun"] ?: 0),
    Item("Desserts","Kheer", 120, itemToImageMap["Kheer"] ?: 0),
    Item("Desserts","Rasmalai", 150, itemToImageMap["Rasmalai"] ?: 0),
    Item("Beverages","Masala Chai", 50, itemToImageMap["Masala Chai"] ?: 0),
    Item("Beverages","Cold Coffee", 80, itemToImageMap["Cold Coffee"] ?: 0),
    Item("Beverages","Fresh Lime Soda", 70, itemToImageMap["Fresh Lime Soda"] ?: 0),
    Item("Salads","Caesar Salad", 180, itemToImageMap["Caesar Salad"] ?: 0),
    Item("Salads","Greek Salad", 200, itemToImageMap["Greek Salad"] ?: 0),
    Item("Salads","Coleslaw", 100, itemToImageMap["Coleslaw"] ?: 0),
    Item("Pasta","Spaghetti Bolognese", 220, itemToImageMap["Spaghetti Bolognese"] ?: 0),
    Item("Pasta","Alfredo Pasta", 200, itemToImageMap["Alfredo Pasta"] ?: 0),
    Item("Pasta","Penne Arrabiata", 180, itemToImageMap["Penne Arrabiata"] ?: 0),
    Item("Pizza","Margherita", 250, itemToImageMap["Margherita"] ?: 0),
    Item("Pizza","Pepperoni", 280, itemToImageMap["Pepperoni"] ?: 0),
    Item("Pizza","Vegetarian Supreme", 230, itemToImageMap["Vegetarian Supreme"] ?: 0),
    Item("Sandwiches","Club Sandwich", 170, itemToImageMap["Club Sandwich"] ?: 0),
    Item("Sandwiches","Grilled Cheese", 120, itemToImageMap["Grilled Cheese"] ?: 0),
    Item("Sandwiches","Veggie Delight", 150, itemToImageMap["Veggie Delight"] ?: 0),
    Item("Biryani","Chicken Biryani", 280, itemToImageMap["Chicken Biryani"] ?: 0),
    Item("Biryani","Veg Biryani", 220, itemToImageMap["Veg Biryani"] ?: 0),
    Item("Biryani","Hyderabadi Biryani", 300, itemToImageMap["Hyderabadi Biryani"] ?: 0),
    Item("Snacks","Samosa", 20, itemToImageMap["Samosa"] ?: 0),
    Item("Snacks","Pakoras", 40, itemToImageMap["Pakoras"] ?: 0),
    Item("Snacks","French Fries", 80, itemToImageMap["French Fries"] ?: 0)
)

data class Item(val category : String , val name: String, val cost_inr: Int, val imageResource: Int)