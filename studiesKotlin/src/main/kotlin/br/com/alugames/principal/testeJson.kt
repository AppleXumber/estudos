package br.com.alugames.principal

import br.com.alugames.modelo.Periodo
import br.com.alugames.servico.ConsumoApi
import java.time.LocalDate

fun main() {
  val consumo = ConsumoApi()
  val listaGamer = consumo.listaGamer()
  val listaJogosJson = consumo.buscaJogosJson()

  val gamerCaroline = listaGamer[3]
  val jogoREVillage = listaJogosJson[10]
  val jogoSpider = listaJogosJson[13]
  val jogoTLOU = listaJogosJson[2]

  val periodo1 = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
  val periodo2 = Periodo(LocalDate.now(), LocalDate.now().plusDays(14))
  val periodo3 = Periodo(LocalDate.now(), LocalDate.now().plusDays(23))

  gamerCaroline.alugaJogo(jogoREVillage, periodo1)
  gamerCaroline.alugaJogo(jogoSpider, periodo2)
  gamerCaroline.alugaJogo(jogoTLOU, periodo3)

  println(gamerCaroline.jogosAlugados)

}