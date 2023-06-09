package com.example.navproj1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Title : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_title, container, false)
        val start:Button = view.findViewById(R.id.start)
        start.setOnClickListener {
            val action = TitleDirections.actionTitleToQ1()
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }

}