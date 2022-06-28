package br.com.zup.minha_musica_favorita.presentation.respository

import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.presentation.model.Album

class AlbumRepository {
    private var listaAlbuns = mutableListOf<Album>()

    fun getListAlbum(): List<Album> {

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
    return listaAlbuns
    }
}