package com.ayeshaazeema.tastee.util

import androidx.recyclerview.widget.DiffUtil

class RecipesDiffUtil<T>(
    private val oldList: List<T>,
    private val newList: List<T>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }
    // Pada fungsi ini kita perlu menentukan apa yang menjadi indikator pembeda
    // antara item satu dengan yang lainya, di sini saya menggunakan field repoName sebagai indikator
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }
    // Di method ini kita menentukan indikator yang akan digunakan
    // untuk menentukan apakah item kita berubah atau tidak
    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}