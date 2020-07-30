package com.example.mibibliotecav2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_ubicacion.*


class UbicacionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ubicacion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
            val safeArgs = UbicacionFragmentArgs.fromBundle(it!!)
            val biblioteca = safeArgs.Bibliotecas
            TV_ubicacion_mapa.text = biblioteca.latitud.toDouble().toString()
        }


    }

}