package br.com.zup.minha_musica_favorita.presentation.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minha_musica_favorita.databinding.FotosBandaBinding
import br.com.zup.minha_musica_favorita.presentation.model.Album

class FotosPagerAdapter(
    private var listaAlbum: MutableList<Album>,
    private var clickDetalhes: (album: Album) -> Unit
) :
    RecyclerView.Adapter<FotosPagerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = FotosBandaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = listaAlbum[position]
        holder.receberInformacoes(item)
        holder.binding.clAlbum.setOnClickListener {
            clickDetalhes(item)
        }

    }

    override fun getItemCount(): Int = listaAlbum.size

    class ViewHolder(val binding: FotosBandaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun receberInformacoes(album: Album) {
            binding.ivImagemBanda.setImageResource(album.getImage())

        }
    }

    fun atualizarListaBanda(novaLista: List<Album>) {
        listaAlbum.addAll(novaLista)
        notifyDataSetChanged()
    }


}