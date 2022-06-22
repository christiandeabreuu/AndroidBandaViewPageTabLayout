package br.com.zup.minha_musica_favorita.presentation.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minha_musica_favorita.R
import br.com.zup.minha_musica_favorita.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBotaoPrincipal.setOnClickListener {
            startActivity(Intent(this, DetalheActivity::class.java))
        }
        R.layout.activity_detalhe
    }
}