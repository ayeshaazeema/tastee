package com.ayeshaazeema.tastee.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ayeshaazeema.tastee.models.Result
import com.ayeshaazeema.tastee.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity (
    // Primary key dapat diartikan sebagai kolom yang berisi nilai unik,
    // berfungsi sebagai identitas untuk membedakan setiap record yang ada pada tabel.
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)