package com.ayeshaazeema.tastee.data.database.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ayeshaazeema.tastee.models.FoodJoke
import com.ayeshaazeema.tastee.util.Constants.Companion.FOOD_JOKE_TABLE

@Entity(tableName = FOOD_JOKE_TABLE)
class FoodJokeEntity(
    // Menandai bidang Entitas atau POJO untuk memungkinkan bidang bertumpuk
    // (yaitu bidang kelas bidang yang dianotasikan) untuk dirujuk langsung di kueri SQL.
    @Embedded
    var foodJoke: FoodJoke
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}