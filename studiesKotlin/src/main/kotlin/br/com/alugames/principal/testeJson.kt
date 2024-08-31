package br.com.alugames.principal

import br.com.alugames.servico.ConsumoApi

fun main(){
    val consumo = ConsumoApi()
    val listaGamer = consumo.listaGamer()
    val listaJogosJson = consumo.buscaJogosJson()

    val gamerCaroline = listaGamer.get(3)
    val jogoREVillage = listaJogosJson.get(10)

    val aluguel = gamerCaroline.alugaJogo(jogoREVillage)
    println(aluguel)

}