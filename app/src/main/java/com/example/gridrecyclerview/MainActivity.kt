package com.example.gridrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.gridrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var madapter: GridAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gridItem = ArrayList<GridItems>()
       for (i in 0..100){
           gridItem.add(GridItems(i.toString()))
       }

        madapter = GridAdapter(gridItem)
        binding.recyclerView.adapter=madapter
        binding.recyclerView.layoutManager = GridLayoutManager(this, 4)
    }
}