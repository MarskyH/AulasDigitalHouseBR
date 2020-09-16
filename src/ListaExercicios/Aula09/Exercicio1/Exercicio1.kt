package ListaExercicios.Aula09.Exercicio1

import java.security.Key

fun main(){
    val sonhosMap: Map<Int, String> = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    val listaJoao: List<String> = listOf<String>("Juan", "Fissura", "Maromba")
    val listaMiguel: List<String> = listOf<String>("Night Watch", "Bruce Wayne", "Tampinha")
    val listaMaria: List<String> = listOf<String>("Wonder Woman", "Mary", "Marilene")
    val listaLucas: List<String> = listOf<String>("Lukinha", "Jorge", "George")
    val apelidosMap: Map<String, List<String>> = mapOf("João" to listaJoao, "Miguel" to listaMiguel, "Maria" to listaMaria, "Lucas" to listaLucas)
    println("Loteria dos Sonhos")
    for (index in sonhosMap){
        println(index)
    }
    println("Lista Apelidos")
    for (index in apelidosMap){
        println(index)
    }
}