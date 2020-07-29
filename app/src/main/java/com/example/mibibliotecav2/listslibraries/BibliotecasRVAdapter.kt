package com.example.mibibliotecav2.listslibraries

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mibibliotecav2.R
import com.example.mibibliotecav2.model.remote.BibliotecasRemote
import kotlinx.android.synthetic.main.bibliotecas_item.view.*

class BibliotecasRVAdapter(
    val bibliotecasList: ArrayList<BibliotecasRemote>
) : RecyclerView.Adapter<BibliotecasRVAdapter.BibliotecasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BibliotecasViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.bibliotecas_item, parent, false)
        return BibliotecasViewHolder(itemView)
    }

    override fun getItemCount(): Int = bibliotecasList.size


    override fun onBindViewHolder(holder: BibliotecasViewHolder, position: Int) {
        val biblioteca = bibliotecasList[position]
        holder.bindBiliotecas(biblioteca)
    }

    class BibliotecasViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        fun bindBiliotecas(biblioteca: BibliotecasRemote) {
            itemView.TV_nombre_biblioteca.text = biblioteca.nombre
            itemView.TV_municpio_biblioteca.text = biblioteca.municipio

            itemView.setOnClickListener {
                Log.d("identificador", biblioteca.id)
            }

        }
    }


}

