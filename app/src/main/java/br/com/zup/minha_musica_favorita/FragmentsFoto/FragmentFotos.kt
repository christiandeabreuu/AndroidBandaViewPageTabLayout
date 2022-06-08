package br.com.zup.minha_musica_favorita.FragmentsFoto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minha_musica_favorita.FotosPagerAdapter
import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.databinding.FragmentFotosBinding


class FragmentFotos : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private val listaFotos = mutableListOf("foto1", "foto2", "foto3", "foto4", "foto5", "foto6")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFotosBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvFotos.adapter = FotosPagerAdapter(listaFotos)
        binding.rvFotos.layoutManager = GridLayoutManager(context, 2)
    }


}