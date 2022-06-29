package br.com.zup.minha_musica_favorita.presentation.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.databinding.ActivityAlbumBinding
import br.com.zup.minha_musica_favorita.presentation.model.Album

class AlbumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true) // habilita o bota de voltar
        supportActionBar?.title = "Detalhe do Album" // muda o nome da appbar

        val bundle = intent.getBundleExtra("BUNDLE")
        val album = bundle?.getParcelable<Album>("ALBUM")
        album?.let {
            binding.tvAlbumActivity1.text = it.getNome()
            binding.tvDetalhesAlbum.text = it.getDetalhe()
            binding.tvArtista.text = getString(R.string.artista, it.getArtista())
            binding.tvLancamento.text = "Lançamento: ${it.getLancamento()}"
            binding.tvGravadora.text = "Gravadora: ${it.getGravadora()}"
            binding.tvEstudio.text = "Estudio: ${it.getEstudio()}"
            binding.tvFormato.text = "Formato: ${it.getFormato()}"
            binding.tvGenero.text = "Genero: ${it.getGenero()}"
            binding.ivFotoAlbumDetalhe.setImageResource(album.getImage())
            binding.ivCoracao.setOnClickListener {
                Toast.makeText(this, "Album adicionado aos favoritos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}