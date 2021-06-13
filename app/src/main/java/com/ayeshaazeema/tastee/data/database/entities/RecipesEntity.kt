package com.ayeshaazeema.tastee.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ayeshaazeema.tastee.models.FoodRecipe
import com.ayeshaazeema.tastee.util.Constants.Companion.RECIPES_TABLE

// When you use the Room persistence library to store your app's data,
// you define entities to represent the objects that you want to store.
// Each entity corresponds to a table in the associated Room database,
// and each instance of an entity represents a row of data in the corresponding table.
@Entity(tableName = RECIPES_TABLE)
class RecipesEntity (
    var foodRecipe:FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}