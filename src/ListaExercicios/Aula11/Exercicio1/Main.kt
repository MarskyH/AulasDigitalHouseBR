package ListaExercicios.Aula11.Exercicio1

fun main() {
    val array = ArrayList<String>()
    array.add("Pato")
    array.add("Cachorro")
    array.add("Gato")
    try {
        println(array.get(3))
    } catch (ex: Exception) {
        println("Ocorreu um erro: ${ex.message}")
        ex.stackTrace
    }
}