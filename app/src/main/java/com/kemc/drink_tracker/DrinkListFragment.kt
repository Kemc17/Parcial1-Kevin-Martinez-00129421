package com.kemc.drink_tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DrinkListFragment : Fragment() {
    private lateinit var actionToDrink: CardView
    private lateinit var actionToNewDrink: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drink_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Adding navigation to the first card view
        actionToDrink = view.findViewById(R.id.drink_1_card)
        //Adding navigation for a new drink
        actionToNewDrink = view.findViewById(R.id.action_to_new_drink)

        actionToDrink.setOnClickListener{
            it.findNavController().navigate(R.id.action_drinkListFragment_to_drinkFragment)
        }

        actionToNewDrink.setOnClickListener{
            it.findNavController().navigate(R.id.action_drinkListFragment_to_newDrinkFragment)
        }
    }

}