package ListaExercicios.Aula05.Exercicio5
fun main(){
    val carro1 = Veiculo("Fiat", "Cronos", "2016", "2015", "Vermelho", "0KM")
    val cliente1 = Cliente("Felipe", "Sales", "(91) 98547-9696")
    val venda1 = Venda(cliente1, carro1, 50000.00)
    var registro1 = Concessionaria("Phoenix")
    println("${registro1.registrarVenda(venda1)}")
}
