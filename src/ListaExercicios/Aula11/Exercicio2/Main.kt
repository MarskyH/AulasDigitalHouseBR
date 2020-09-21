package ListaExercicios.Aula11.Exercicio2

import java.lang.Exception

fun main() {
//    val array = ArrayList<String>()
//    array.add("Pato")
//    array.add("Cachorro")
//    array.add("Gato")
//    try {
//        println(array.get(5))
//    } catch (ex: Exception) {
//        println("Ocorreu um erro:" +
//                "\nMenssagem: ${ex.message} " +
//                "\nCausa: ${ex.cause}" +
//                "\nLocalização: ${ex.localizedMessage}")
//    }

    try {
        val array = ArrayList<String>(null)
        array.add("Pato")
        array.add("Cachorro")
        array.add("Gato")
        println(array.get(2))
    }catch (ex: Exception){
        println("Ocorreu um erro:" +
                "\nMenssagem: ${ex.message} " +
                "\nCausa: ${ex.cause}" +
                "\nLocalização: ${ex.localizedMessage}")
    }


}