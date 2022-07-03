package com.example.filmex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmex.adapter.MainAdapter
import com.example.filmex.model.Movie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = mutableListOf<Movie>()
        for(i in 0 until 6){
            val movie = Movie(R.drawable.img_1)
            movies.add(movie)
        }

        val rv: RecyclerView = findViewById(R.id.recycler_view)
        val adapter = MainAdapter(movies)
        rv.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv.adapter = adapter
    }


}