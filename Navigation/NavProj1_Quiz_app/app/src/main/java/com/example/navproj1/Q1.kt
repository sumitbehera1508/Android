package com.example.navproj1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class Q1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_q1, container, false)

        val optionA:Button = view.findViewById(R.id.Q1a)
        val optionB:Button = view.findViewById(R.id.Q1b)
        val optionC:Button = view.findViewById(R.id.Q1c)
        val optionD:Button = view.findViewById(R.id.Q1d)
        val next:Button = view.findViewById(R.id.next)
        val retry:Button = view.findViewById(R.id.retry)
        val pre:Button = view.findViewById(R.id.Prev)
        val buttons = arrayOf(optionB,optionC,optionD)

        optionA.setOnClickListener {
            Toast.makeText(activity,"Correct Answer",Toast.LENGTH_SHORT).show()
            next.visibility = View.VISIBLE
            retry.visibility = View.GONE
        }
        for(items in buttons){
            items.setOnClickListener {
                Toast.makeText(activity,"Wrong Answer",Toast.LENGTH_SHORT).show()
                retry.visibility = View.VISIBLE
                next.visibility = View.GONE
            }
        }

        next.setOnClickListener {
            val action = Q1Directions.actionQ1ToQ2()
            Navigation.findNavController(view).navigate(action)
        }
        pre.setOnClickListener {
            val action2 = Q1Directions.actionQ1ToTitle()
            Navigation.findNavController(view).navigate(action2)
        }
            return view
    }

}