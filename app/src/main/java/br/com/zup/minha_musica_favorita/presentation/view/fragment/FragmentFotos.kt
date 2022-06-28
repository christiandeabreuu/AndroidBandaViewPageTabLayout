package br.com.zup.minha_musica_favorita.presentation.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minha_musica_favorita.presentation.model.Album
import br.com.zup.minha_musica_favorita.presentation.view.activity.AlbumActivity
import br.com.zup.minha_musica_favorita.presentation.view.adapter.FotosPagerAdapter
import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.databinding.FragmentFotosBinding
import br.com.zup.minha_musica_favorita.presentation.respository.AlbumRepository
import br.com.zup.minha_musica_favorita.presentation.viewModel.AlbumViewModel


class FragmentFotos : Fragment() {

    private lateinit var binding: FragmentFotosBinding
    private var listaAlbuns = mutableListOf<Album>()
    private val repository = AlbumRepository()
    private val viewModel: AlbumViewModel by lazy {
        ViewModelProvider(this)[AlbumViewModel::class.java]
    }
    private val adapter by lazy {
        FotosPagerAdapter(listaAlbuns, this::irParaDetalheAlbum)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFotosBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvFotos.adapter = adapter
        binding.rvFotos.layoutManager = GridLayoutManager(context, 2)
        repository.getListAlbum()
        observable()
    }

    fun irParaDetalheAlbum(album: Album) {
        val bundle = bundleOf("ALBUM" to album)
        val intent = Intent(context, AlbumActivity::class.java).apply {
            putExtra("BUNDLE", bundle)
        }
        startActivity(intent)
    }

    private fun observable() {
        viewModel.album.observe(this.viewLifecycleOwner) {
            adapter.atualizarListaBanda(it as MutableList<Album>)
        }
    }
}


