package com.example.navex2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PersonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_person, container, false)

        view.findViewById<Button>(R.id.Home).setOnClickListener {
            findNavController().navigate(R.id.action_PersonFrag_to_HomeFrag)
        }

        return view
    }
}