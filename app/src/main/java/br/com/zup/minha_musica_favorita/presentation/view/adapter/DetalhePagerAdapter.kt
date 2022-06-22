package br.com.zup.minha_musica_favorita

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minha_musica_favorita.presentation.view.fragment.FragmentFotos
import br.com.zup.minha_musica_favorita.presentation.view.fragment.FragmentInformacoes

class DetalhePageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
//    private var listaTitulos: List<String>

) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return FragmentInformacoes()
            1 -> return FragmentFotos()
        }
        return FragmentFotos()
    }



}



