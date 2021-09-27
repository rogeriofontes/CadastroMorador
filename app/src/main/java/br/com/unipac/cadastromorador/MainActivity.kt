package br.com.unipac.cadastromorador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.unipac.cadastromorador.model.domain.Morador
import br.com.unipac.cadastromorador.model.repositorios.MoradorRepositorio

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nomeMoradorEdt = findViewById<EditText>(R.id.nomeMoradorEdt)
        var  emailMoradorEdt =findViewById<EditText>(R.id.emailMoradorEdt)
        var idadeEdt =findViewById<EditText>(R.id.idadeEdt)
        var btnSalvar =  findViewById<Button>(R.id.btnSalvar)

        var moradorRepositorio = MoradorRepositorio(this)

        btnSalvar.setOnClickListener {
            var nomeMoradorEdt = nomeMoradorEdt.text.toString()
            var emailMoradorEdt = emailMoradorEdt.text.toString()
            var idadeEdt = idadeEdt.text.toString()

            var morador = Morador(1, nomeMoradorEdt, emailMoradorEdt, idadeEdt.toInt())
            moradorRepositorio.salvar(morador)
        }
    }
}