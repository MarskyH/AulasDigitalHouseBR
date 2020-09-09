package br.com.digitalhouse.HerancaClasseAbstrata

class Gato: Felino() {
    override val cor: String = "Amarelo"



   fun gatoAndando(){
      super.locomover()
       println("A cor é $cor")
  }
}