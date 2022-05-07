package com.example.practicacalificada2pm.vistas.plate

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicacalificada2pm.R


class PlateViewHolder (inflater: LayoutInflater,parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_plate, parent,false)) {
    private var img:ImageView? = null
    private var textNombre: TextView? = null
    private var textCategoria: TextView? = null
    private var textPrecio: TextView? = null
    private var textDescripcion: TextView? = null
    init {
        img = itemView.findViewById(R.id.img)
        textNombre = itemView.findViewById(R.id.nombre)
        textCategoria = itemView.findViewById(R.id.categoria)
        textPrecio = itemView.findViewById(R.id.precio)
        textDescripcion = itemView.findViewById(R.id.descripcion)
    }
    fun bind(plate: Plate){
        img?.setImageResource(plate.imagen)
        textNombre?.text = plate.nombre
        textCategoria?.text = plate.categoria
        textPrecio?.text = plate.precio
        textDescripcion?.text = plate.descripcion
    }
}