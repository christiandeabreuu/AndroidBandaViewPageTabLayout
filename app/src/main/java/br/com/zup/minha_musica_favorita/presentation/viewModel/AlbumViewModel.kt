package br.com.zup.minha_musica_favorita.presentation.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minha_musica_favorita.presentation.model.Album
import br.com.zup.minha_musica_favorita.presentation.respository.AlbumRepository

class AlbumViewModel() : ViewModel() {

    private val repository = AlbumRepository()
    private val _album: MutableLiveData<List<Album>> = MutableLiveData()
    val album: LiveData<List<Album>> = _album

    fun getAllAlbum() {
        try {
            _album.value = repository.getListAlbum()
        } catch (ex: Exception) {
            Log.i("Error", "------> ${ex.message}")
        }
    }
}
