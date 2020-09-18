package ListaExercicios.Aula10.Exercicio2

fun main(){
    val coca1 = Coca(10, 6.00)
    val coca2 = Coca(10, 5.00)
    println(coca1)
    println(coca2)
    println(coca1.equals(coca2))
    println(coca1.preco.equals(coca2.preco))
    println(coca1.tamanho.equals(coca2.tamanho))
}