package com.example.practicacalificada2pm.vistas.plate
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.practicacalificada2pm.R
import kotlinx.android.synthetic.main.fragment_plate.*

class PlateFragment : Fragment() {

    private val listPlate = listOf(
        Plate("Pizza DMarco","Pizzas","S/ 25.00","La mejor pizza con la combinación perfecta de queso, espinaca y carnes del norte trujillano",R.drawable.imagen1),
        Plate("Duo DMarco","Bebidas","S/ 15.00","La combinación perfecta para compartir entre amigos",R.drawable.imagen2),
        Plate("Pan con Pollo","Sanguches","S/ 15.00","El tradicional pan con pollo trujillano, solo en DMarco",R.drawable.imagen3),
        Plate("Cafe","Bebidas","S/ 10.00","Los mejores granos del norte peruano solo en DMarco", R.drawable.imagen4),
        Plate("Ceviche","Pescado","S/ 40.00","El mejor ceviche del norte trujillano con pescado blanco",R.drawable.imagen5),
    )

    companion object{
        fun newInstance(): PlateFragment = PlateFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_plate,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RecyclerPlate.apply {
            layoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
            adapter= PlateAdapter(listPlate)
        }
    }
}