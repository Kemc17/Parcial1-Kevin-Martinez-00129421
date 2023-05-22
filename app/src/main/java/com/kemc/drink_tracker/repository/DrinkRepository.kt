package com.kemc.drink_tracker.repository

import com.kemc.drink_tracker.data.viewmodels.DrinkModel

class DrinkRepository(private val drinks: MutableList<DrinkModel>) {
    fun getDrinks() = drinks
    fun addDrink(newDrink: DrinkModel) = drinks.add(newDrink)

}