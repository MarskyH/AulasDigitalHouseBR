package ListaExercicios.Aula06.ExercicioIngresso

import java.util.*

fun main(){
    var ler = Scanner(System.`in`)
    println("Insira o nome do Cliente:")
    val nome: String = ler.next()
    println("Digite 1 para ingresso normal ou 2 para ingresso VIP")
    var escolha:Int = ler.nextInt()
    while (escolha != 1 && escolha != 2 ){
        println("Valor Inválido")
        println("Digite 1 para ingresso normal ou 2 para ingresso VIP")
        escolha = ler.nextInt()
    }
    when(escolha){
        1 -> {
            var ingresso1 = Normal(25.50)
            println("${ingresso1.imprimeIngresso()}")
            println("Cliente: $nome ")

        }
        2 ->{
            println("Ingresso VIP")
            println("Digite 1 para Camarote Inferior ou 2 para Camarote Superior")
            escolha = ler.nextInt()
            while (escolha != 1 && escolha != 2 ){
                println("Valor Inválido")
                println("Digite 1 para Camarote Inferior ou 2 para Camarote Superior")
                escolha = ler.nextInt()
            }
            when(escolha){
                1 ->{
                    println("Ingresso VIP - Camarote Inferior")
                    var ingresso2 = CamaroteInferior(25.50, "Andar Inferior - B9")
                    println("Cliente: $nome \n${ingresso2.imprimeInferior()}")
                }
                2 ->{
                    println("Ingresso VIP - Camarote Inferior")
                    var ingresso2 = CamaroteSuperior(25.50, "Andar Superior - A20")
                    println("Cliente: $nome \n${ingresso2.imprimeSuperior()}")
                }
            }
        }
    }
}