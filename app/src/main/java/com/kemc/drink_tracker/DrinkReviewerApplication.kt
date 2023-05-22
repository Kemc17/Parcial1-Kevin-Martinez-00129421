package com.kemc.drink_tracker

import android.app.Application
import com.kemc.drink_tracker.data.drinks
import com.kemc.drink_tracker.repository.DrinkRepository

class DrinkReviewerApplication: Application() {
    val drinkRepository: DrinkRepository by lazy {
        DrinkRepository(drinks)
    }
}