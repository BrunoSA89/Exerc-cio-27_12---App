package com.example.exercicio27_12app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FragmentSecond : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next).setOnClickListener {
//            findNavController().navigate(R.id.action_fragment_second_for_fragment_three)
        }
    }

}