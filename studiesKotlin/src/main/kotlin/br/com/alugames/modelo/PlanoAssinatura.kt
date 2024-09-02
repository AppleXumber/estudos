package br.com.alugames.modelo

class PlanoAssinatura(tipo:String, val mensalidade: Double, val jogosIncluidos: Int):Plano(tipo){
  override fun getValor(aluguel: Aluguel): Double {

    val jogosNoMes = aluguel.gamer.jogosDoMes(aluguel.periodo.dataInicial.monthValue).size + 1
    return if(jogosNoMes <= jogosIncluidos) {
      0.0
    } else {
      super.getValor(aluguel)
    }
  }
}
