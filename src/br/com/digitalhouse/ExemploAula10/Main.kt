package br.com.digitalhouse.ExemploAula10

fun main() {
    var notebook1 = Notebook("Dell", 3000.00)
    println(notebook1)

    var notebook2 = Notebook("POsitivo", 3000.00)
    println(notebook1.equals(notebook2))

    var copyNotebook2 = notebook2.copy(preco = 4000.00)
    println(copyNotebook2)

 
}