package com.kemc.drink_tracker.ui.drink

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import com.kemc.drink_tracker.R
import com.kemc.drink_tracker.data.viewmodels.DrinkModel


class NewDrinkFragment : Fragment() {
    private val viewModel: DrinkViewModel by activityViewModels {
        DrinkViewModel.Factory
    }

    private lateinit var name: TextInputEditText
    private lateinit var ingredients: TextInputEditText
    private lateinit var action: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_drink, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind(view)
        action.setOnClickListener{
            createDrink()
        }

    }
    private fun bind(view: View){
        name = view.findViewById(R.id.textInput_name)
        ingredients = view.findViewById(R.id.textInput_ingredients)
        action = view.findViewById(R.id.button)
    }

    private fun createDrink(){
        val newDrink = DrinkModel(
            name.text.toString(),
            ingredients.text.toString()
        )
        viewModel.addDrinks(newDrink)

        Log.d("APP TAG", viewModel.getDrinks().toString())

        findNavController().popBackStack()
    }

}