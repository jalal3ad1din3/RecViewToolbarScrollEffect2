package com.example.recviewtoolbarscrolleffect2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recviewtoolbarscrolleffect2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        val member = prepareList()
        refreshAdapter(member)
    }

    fun initView(){

        recyclerView.layoutManager = GridLayoutManager(this,1)

    }

    fun prepareList():List<Member>{
        val member = ArrayList<Member>()

        for (i in 0..3){
            member.add(Member("Jilo"+i,"Eods"+i))
        }
        return member
    }
    fun refreshAdapter(member: List<Member>){
        val adapter = CustomAdapter(member)
        recyclerView.adapter = adapter
    }
}