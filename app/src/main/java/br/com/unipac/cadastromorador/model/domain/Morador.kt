package br.com.unipac.cadastromorador.model.domain

data class Morador(
    var id: Long = 0,
    var nome: String = "",
    var email: String = "",
    var idade: Int = 0
)