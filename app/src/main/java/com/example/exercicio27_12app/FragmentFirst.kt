package com.example.exercicio27_12app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin.setOnClickListener {
            findNavController().navigate(R.id.actionHomeToFragmentFour)
        }

//        button2.setOnClickListener {
//            findNavController().navigate(R.id.action_login_fragment_second)
//        }
//
//        button3.setOnClickListener {
//            findNavController().navigate(R.id.action_login_fragment_five)
//        }
    }
}