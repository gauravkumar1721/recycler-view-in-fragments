package com.example.myapplicationfragment.RecyclerAdapter

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationfragment.R

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

   

    init {
        var itemKode: TextView = itemView.findViewById(R.id.kode)
        var itemKate: TextView = itemView.findViewById(R.id.kate)
        var itemIsi: TextView = itemView.findViewById(R.id.isiPertanyaan)
        
        itemView.setOnClickListener {
            var position: Int = this.adapterPosition
            val context = itemView.context
            val intent = Intent(context, DetailPertanyaan::class.java).apply {
                putExtra("NUMBER", position)
                putExtra("CODE", itemKode.text)
                putExtra("CATEGORY", itemKate.text)
                putExtra("CONTENT", itemIsi.text)
            }
            context.startActivity(intent)
        }
    }
}

class DetailPertanyaan {

}
