package ListaExercicios.Aula05
fun main(){
    val cliente1 = Cliente("Marcus", "Loureiro")
    val cliente2 = Cliente("Rafael", "Souza")
    var conta1 = Conta(15987, 1000.50, cliente1)
    var conta2 = Conta(11235, 4000.75, cliente2)
    println(conta1.Depositar(100.50))
    println(conta1.Sacar(300.45))
    println(conta2.Depositar(50.50))
    println(conta2.Sacar(200.45))

}

