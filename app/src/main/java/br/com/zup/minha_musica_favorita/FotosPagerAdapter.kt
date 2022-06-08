package br.com.zup.minha_musica_favorita

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minha_musica_favorita.databinding.FotosBandaBinding

class FotosPagerAdapter(private var listaFotos: MutableList<String>) :
    RecyclerView.Adapter<FotosPagerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FotosPagerAdapter.ViewHolder {
        val binding = FotosBandaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FotosPagerAdapter.ViewHolder, position: Int) {

        val item = listaFotos[position]
        holder.titulo.text = item
    }

    override fun getItemCount(): Int = listaFotos.size


    class ViewHolder(binding: FotosBandaBinding) : RecyclerView.ViewHolder(binding.root) {
        var titulo = binding.tvTituloBanda

    }


}