package br.com.unipac.cadastromorador.model.repositorios

import android.content.Context
import br.com.unipac.cadastromorador.model.domain.Morador

class MoradorRepositorio(context: Context) {
    var moradores: ArrayList<Morador>? = null

    fun salvar(morador: Morador) {
        moradores?.add(morador)
    }

    fun listarMoradores(): List<Morador>? {
        return moradores
    }
}