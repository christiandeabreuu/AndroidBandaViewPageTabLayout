package br.com.zup.minha_musica_favorita.presentation.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minha_musica_favorita.presentation.model.Album
import br.com.zup.minha_musica_favorita.presentation.view.activity.AlbumActivity
import br.com.zup.minha_musica_favorita.presentation.view.adapter.FotosPagerAdapter
import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.databinding.FragmentFotosBinding


class FragmentFotos : Fragment() {

    private lateinit var binding: FragmentFotosBinding
    private var listaAlbuns = mutableListOf<Album>()
    private val  adapter by lazy {
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
        adicionarItemListaAlbuns()
    }

    private fun adicionarItemListaAlbuns() {
        listaAlbuns = mutableListOf<Album>()

        listaAlbuns.add(
            Album(
                R.drawable.acustico_mtv,
                "AcusticoMtv",
                "Acústico MTV é o primeiro álbum ao vivo da banda brasileira Charlie Brown Jr., lançado em 2003 em CD e DVD. O álbum faz parte da série Acústico MTV, da MTV Brasil.",
                "Chalie Brow Jr",
                2003,
                "EMI",
                "MTV",
                "CD, DVD",
                "Skate punk, reggae, rock alternativo, hip hop",


            )
        )
        listaAlbuns.add(
            Album(
                R.drawable.preco_curto_prazo_longo,
                "Preço curto, prazo longo",
                "sem detalhes",
                "Chalie Brow Jr",
                1999,
                "EMI Brazil",
                "MTV",
                "CD, DVD",
                "Skate punk, reggae, rock alternativo, hip hop",
            )
        )
        listaAlbuns.add(
                Album(
                    R.drawable.irmandade_musical,
                    "irmandade musical",
                    "sem detalhes",
                    "Chalie Brow Jr",
                    1994,
                    "EMI",
                    "MTV",
                    "CD, DVD",
                    "Skate punk, reggae, rock alternativo, hip hop",
                )
        )
        listaAlbuns.add(
            Album(
                R.drawable.nadando_com_os_tubaroes,
                "nadando com os tubarões",
                "sem detalhes",
                "Chalie Brow Jr",
                1994,
                "EMI",
                "MTV",
                "CD, DVD",
                "Skate punk, reggae, rock alternativo, hip hop",
            )
        )
        listaAlbuns.add(
            Album(
                R.drawable.preco_curto_prazo_longo,
                "preco curto, prazo longo",
                "sem detalhes",
                "Chalie Brow Jr",
                1994,
                "EMI",
                "MTV",
                "CD, DVD",
                "Skate punk, reggae, rock alternativo, hip hop",
            )
        )
        listaAlbuns.add(
            Album(
                R.drawable.ritmo_atual,
                "ritmo atual",
                "sem detalhes",
                "Chalie Brow Jr",
                1994,
                "EMI",
                "MTV",
                "CD, DVD",
                "Skate punk, reggae, rock alternativo, hip hop",
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.cem_por_cento,
                "100% CBJR",
                "100% Charlie Brown Jr. - Abalando a Sua Fábrica é o quarto álbum da banda brasileira Charlie Brown Jr. Foi o primeiro álbum da banda com a formação de um quarteto",
                "Chalie Brow Jr",
                1994,
                "EMI",
                "MTV",
                "CD, DVD",
                "Skate punk, reggae, rock alternativo, hip hop",
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.victor_modelo,
                "Victor Carvalho de Jesus",
                "O cara mais bonito da Zup",
                "Victor",
                2022,
                "Zup music",
                "Android",
                "Mobile",
                "Samba de raiz, frevo e sertanejo",
            )
        )

        adapter.atualizarListaBanda(listaAlbuns)
    }
    fun irParaDetalheAlbum(album: Album){
        val bundle = bundleOf("ALBUM" to album)
        val intent = Intent(context, AlbumActivity::class.java).apply {
            putExtra("BUNDLE", bundle)
        }
        startActivity(intent)
    }


}


