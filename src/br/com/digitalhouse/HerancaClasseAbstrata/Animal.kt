package br.com.digitalhouse.HerancaClasseAbstrata

open class Animal(open val idade: Int = 0, open val especie: String = "") {


    open fun locomover() {}

    fun idade() {
        println("O animal tem idade de $idade e é de especie $especie")
    }
}