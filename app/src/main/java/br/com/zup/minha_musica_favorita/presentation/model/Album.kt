package br.com.zup.minha_musica_favorita.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class Album(
    private var imagem: Int,
    private var nome: String,
    private var detalhe: String,
    private var artista: String,
    private var lancamento: Int,
    private var gravadora: String,
    private var estudio: String,
    private var formato: String,
    private var genero: String,
) : Parcelable {

    fun getImage() = imagem
    fun getNome() = this.nome
    fun getDetalhe() = this.detalhe
    fun getArtista() = this.artista
    fun getLancamento() = this.lancamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero

}
