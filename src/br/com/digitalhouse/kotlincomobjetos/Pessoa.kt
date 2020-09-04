package br.com.digitalhouse.kotlincomobjetos

class Pessoa (var nome: String, var sobrenome: String){


    private fun criarRG(nome: String, numero: Int): String{
        return nome +" "+ numero
    }
    fun passearComDog(cachorro: Cachorro){
        println("Estou passeando com o dog ${cachorro.nome}, idade ${cachorro.idade} e de raca ${cachorro.raca}")
    }

//    init {
//        println("Nome é: $nome $sobrenome")
//    }
//    var sexo: String = "M"
//    init {
//        println("Sexo e: $sexo")
//    }

   /* //propriedades que já estão sendo incializadas
    var nome: String = "Marcus"
    var idade: Int = 18
    val sobrenome: String = "Loureiro"*/
}