package com.example.semana15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null
    private var recyclerViewAdapter: Reciclerview? = null
    private var lisamigos= mutableListOf<alma>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lisamigos=ArrayList()
        recyclerView=findViewById(R.id.amiguitos)as RecyclerView
        recyclerViewAdapter=Reciclerview(lisamigos)
        val layoutManager:RecyclerView.LayoutManager=LinearLayoutManager(this)
        recyclerView!!.layoutManager=layoutManager
        recyclerViewAdapter!!.setOnItemClickListener(object:ClickListener<alma>{
            override fun onItemClick(data: alma) {
               Toast.makeText(this@MainActivity,data.nombre,Toast.LENGTH_SHORT).show()
            }
        })
        recyclerView!!.adapter=recyclerViewAdapter
         laime()

    }
    private fun laime(){
        var friends=alma("jaime",R.drawable.jaimo,"  Mi buen amigo jaime un ser que alumbra a toda la gente con su caminar y su cabello tan sedoso")
        lisamigos.add(friends)
        friends=alma("chamba",R.drawable.chamba,"  Muy solidario con las persona que  lo rodea")
        lisamigos.add(friends)
        friends=alma("melvito",R.drawable.melvito,"  Es muy aplicado con las tareas  que hace")
        lisamigos.add(friends)
        friends=alma("adiel",R.drawable.adiel,"  Es muy amable con todos y con todas...")
        lisamigos.add(friends)
        friends=alma("gabriel",R.drawable.jaimo,"  Es humilde sencillo y modesto en la vida")
        lisamigos.add(friends)
        friends=alma("cristiano",R.drawable.cristiano,"  Hace el siuuuuuuuuuuuuuuuuuuuuu")
        lisamigos.add(friends)
        recyclerViewAdapter?.notifyDataSetChanged()

    }

}