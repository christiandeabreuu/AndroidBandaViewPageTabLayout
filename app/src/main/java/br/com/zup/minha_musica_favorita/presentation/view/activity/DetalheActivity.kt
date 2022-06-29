package br.com.zup.minha_musica_favorita.presentation.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minha_musica_favorita.DetalhePageAdapter
import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.databinding.ActivityDetalheBinding
import com.google.android.material.tabs.TabLayoutMediator

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheBinding

//    private val listaTitulos = listOf("Informações", "Fotos" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vpDetalhe.adapter = DetalhePageAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(binding.tbDetalhe, binding.vpDetalhe) { tab, position ->
            when (position) {
                0 -> tab.text = "Informações"
                1 -> tab.text = "Fotos"
            }

        }.attach()

        supportActionBar?.setDisplayHomeAsUpEnabled(true) // habilita o bota de voltar
        supportActionBar?.setTitle(R.string.appbar_DetalheBanda) // troca o nome da appbar


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
