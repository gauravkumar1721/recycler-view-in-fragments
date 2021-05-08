package com.example.myapplicationfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder as ViewHolder1

class RecycleAdapter: RecyclerView.Adapter<ViewHolder1>() {

    private val kode = arrayOf("d116df5",
        "36ffc75", "f5cfe78", "5b87628",
        "db8d14e", "9913dc4", "e120f96",
        "466251b")

    private val kate = arrayOf("Kek", "Tek",
        "Klara", "Basis",
        "K", "Hut",
        "Tek", "Pid")

    private val isi = arrayOf("pertanyaan 9",
        "pertanyaan 11", "pertanyaan 17", "test forum",
        "pertanyaan 12", "pertanyaan 18", "pertanyaan 20",
        "pertanyaan 21")


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder1 {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_pertanyaan, viewGroup, false)
        return ViewHolder1(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder1, i: Int) {
        kode[i].also { ViewHolder1.itemKode.text = it }
        ViewHolder1.itemkate.text = kate[i]
        ViewHolder1.itemisi.text = isiPertanyaan[i]

    }

    override fun getItemCount(): Int {
        return kode.size
    }
}