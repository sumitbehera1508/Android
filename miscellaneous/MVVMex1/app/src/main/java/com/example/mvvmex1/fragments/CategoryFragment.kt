package com.example.mvvmex1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmex1.R
import com.example.mvvmex1.adapter.NewsAdapter
import com.example.mvvmex1.listners.NewsItemClicked


class CategoryFragment : Fragment(),NewsItemClicked {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_category, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview3)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.hasFixedSize()


        val url = "https://newsapi.org/v2/top-headlines?country=in&category=technology&apiKey=017688d9c55f46d493bfb4b3391d3c35"

        val adapter = NewsAdapter(this)
        context?.let { loadMe(view, it,adapter,url) }
        recyclerView.adapter = adapter
        return view
    }

}