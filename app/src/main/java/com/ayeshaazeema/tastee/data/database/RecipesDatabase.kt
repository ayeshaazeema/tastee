package com.ayeshaazeema.tastee.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ayeshaazeema.tastee.data.database.entities.FavoritesEntity
import com.ayeshaazeema.tastee.data.database.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class],
    version = 1,
    exportSchema = false
)
// Untuk menyimpan beberapa type costum dalam database.
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {
    abstract fun recipesDao(): RecipesDao
}

