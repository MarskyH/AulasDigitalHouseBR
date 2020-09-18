package ListaExercicios.Aula10.Exercicio1

fun main(){
    val pessoa1 = Pessoa("Julia", 845712)
    val pessoa2 = Pessoa("Pedro", 845712)
    println(pessoa1)
    println(pessoa2)
    println(pessoa1.equals(pessoa2))
    println(pessoa1.nome.equals(pessoa2.nome))
    println(pessoa1.RG.equals(pessoa2.RG))
}