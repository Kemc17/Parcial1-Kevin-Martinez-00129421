package com.kemc.drink_tracker.data

import com.kemc.drink_tracker.data.viewmodels.DrinkModel

val name = "Coca Cola"
val ingredients = "Agua carbonatada, azúcar, colorante: caramelo, acidulante: ácido fosfórico, aromatizantes. Contiene cafeína. No aporta cantidades significativas de Proteínas, Grasas Saturadas, Grasas Trans, Fibra Alimentaria. * % Valores Diarios con base a una dieta de 2.000 kcal u 8.400 kJ."

val name2 = "Pepsi"
val ingredients2 = "Agua carbonatada, azúcar, colorante: E-150d, acidulante: E-338, aromas (contiene cafeína), edulcorantes: acesulfamo K y sucralosa."

val drinks = mutableListOf(
    DrinkModel(name, ingredients),
    DrinkModel(name2, ingredients2)
)


