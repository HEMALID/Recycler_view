package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rec=findViewById<RecyclerView>(R.id.recycler)

        var lm: RecyclerView.LayoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false )

        rec.layoutManager=lm

        var ad=MyAdapter()
        rec.adapter=ad

    }
}