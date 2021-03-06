package com.ayeshaazeema.tastee.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ayeshaazeema.tastee.R
import com.ayeshaazeema.tastee.models.ExtendedIngredient
import com.ayeshaazeema.tastee.util.Constants.Companion.BASE_IMG_URL
import com.ayeshaazeema.tastee.util.RecipesDiffUtil
import kotlinx.android.synthetic.main.ingredients_row_layout.view.*
import java.util.*

class IngredientsAdapter: RecyclerView.Adapter<IngredientsAdapter.MyViewHolder>() {

    private var ingredientsList = emptyList<ExtendedIngredient>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    // membuat suatu tampilan dan mengembalikannya
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ingredients_row_layout, parent, false))
    }
    //menghubungkan data dengan view holder pada posisi yang ditentukan dalam RecyclerView.
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.ingredient_imageView.load(BASE_IMG_URL + ingredientsList[position].image) {
            crossfade(600)
            error(R.drawable.ic_image)
        }
        holder.itemView.ingredient_name.text = ingredientsList[position].name.capitalize()
        holder.itemView.ingredient_amount.text = ingredientsList[position].amount.toString()
        holder.itemView.ingredient_unit.text = ingredientsList[position].unit
        holder.itemView.ingredient_consistency.text = ingredientsList[position].consistency
        holder.itemView.ingredient_original.text = ingredientsList[position].original
    }
    // mengembalikan jumlah total item dalam kumpulan data yang dipegang oleh adapter
    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    fun setData(newIngredients: List<ExtendedIngredient>) {
        val ingredientsDiffUtil =
            RecipesDiffUtil(ingredientsList, newIngredients)
        val diffUtilResult = DiffUtil.calculateDiff(ingredientsDiffUtil)
        ingredientsList = newIngredients
        diffUtilResult.dispatchUpdatesTo(this)
    }

}