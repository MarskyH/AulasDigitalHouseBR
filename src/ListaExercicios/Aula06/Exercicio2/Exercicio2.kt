package ListaExercicios.Aula06.Exercicio2

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Digite o seu nome:")
    val nome1:String = scanner.next()
    println("Digite o seu sobrenome:")
    val sobrenome1:String = scanner.next()
    println("Digite a sua idade:")
    var idade1: Int = scanner.nextInt()
    println("Digite o seu Sexo (F) ou (M):")
    var sexo1: String = scanner.next()
    println("Digite a quantidade de anos de contrinbuição:")
    var anoContribuiçao1:Int = scanner.nextInt()
    val aposentado1 = Aposentado(nome1, sobrenome1, idade1, anoContribuiçao1, sexo1)
    println(aposentado1.testarBeneficio(aposentado1))
}