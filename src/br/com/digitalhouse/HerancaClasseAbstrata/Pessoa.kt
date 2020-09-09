package br.com.digitalhouse.HerancaClasseAbstrata

class Pessoa(idade: Int = 0, especie: String = "", val nome: String = "") : Animal(idade, especie) {

    override fun locomover() {
        for (passos in 0..10) {
            println("A pessoa $nome está no passo $passos")
        }
    }

    fun idadePessoa() {
        super.idade()
        print("Nome $nome e é uma pessoa")
    }

}
