package com.example.exercicio27_12app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentThree : Fragment(R.id.fragmentThree) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.Button4).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentThree_para_serviço)
        }
    }

}