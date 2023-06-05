package com.example.ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    private val box1: TextView
        get() = findViewById(R.id.Box1)
    private val box2: TextView
        get()= findViewById(R.id.Box2)
    private val box3: TextView
        get()= findViewById(R.id.Box3)
    private val box4: TextView
        get() = findViewById(R.id.Box4)
    private val box5: TextView
        get()= findViewById(R.id.Box5)
    private  val bg:ConstraintLayout
        get() = findViewById(R.id.Bg)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val clickables = listOf(bg,box1, box2, box3, box4, box5)
        for (item in clickables) {
            item.setOnClickListener{
                when(item){
                    box1 -> box1.setBackgroundResource(android.R.color.holo_green_light)
                    box2 -> box2.setBackgroundResource(R.color.purple_200)
                    box3 -> box3.setBackgroundResource(androidx.appcompat.R.color.switch_thumb_material_dark)
                    box4 -> box4.setBackgroundResource(androidx.appcompat.R.color.switch_thumb_material_dark)
                    box5 -> box5.setBackgroundResource(androidx.appcompat.R.color.switch_thumb_material_dark)
                    bg -> bg.setBackgroundResource(R.drawable.img)
                }
            }
        }
    }


}