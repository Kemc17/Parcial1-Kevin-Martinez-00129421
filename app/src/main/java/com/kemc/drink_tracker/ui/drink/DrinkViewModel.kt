package com.kemc.drink_tracker.ui.drink

import android.text.Editable.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.kemc.drink_tracker.DrinkReviewerApplication
import com.kemc.drink_tracker.data.viewmodels.DrinkModel
import com.kemc.drink_tracker.repository.DrinkRepository

class DrinkViewModel(private val repository: DrinkRepository):ViewModel() {
    fun getDrinks() = repository.getDrinks()
    fun addDrinks(drink: DrinkModel) = repository.addDrink(drink)

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as DrinkReviewerApplication
                DrinkViewModel(app.drinkRepository)
            }
        }
    }
}