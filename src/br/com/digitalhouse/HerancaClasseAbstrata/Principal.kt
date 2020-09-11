package br.com.digitalhouse.HerancaClasseAbstrata

fun main() {
    println("OBJETO PESSOA ------------------------------------------")
    val brasileiro = Pessoa(19,"Ser Humano","João")

    brasileiro.locomover()
    brasileiro.idadePessoa()
    println(brasileiro.come("Feijoada"))

    println("OBJETO FELINO ------------------------------------------")
    val pantera = Felino()
    pantera.locomover()

    println("OBJETO GATO ------------------------------------------")
    val gatinhoPelucia = Gato()
    gatinhoPelucia.gatoAndando()

}