package ListaExercicios.Aula06.ExercicioSantander

fun main(){
    var cliente1 = Cliente(19568, "Marcus", "Loureiro", "200.857.891-74")
    var contaPoupanca1 = ContaPoupanca(500.00, cliente1)
    println(contaPoupanca1.depositarSaldo(100.00))
    println(contaPoupanca1.recolherJuros())
    println(contaPoupanca1.consultarSaldo())
    println(contaPoupanca1.sacarSaldo(300.00))
    var cliente2 = Cliente(19568, "Luiz", "Moraes", "252.555.891-02")
    var contaCorrente1 = ContaCorrente(500.00, 500.00, cliente2)
    println(contaCorrente1.depositarSaldo(100.00))
    println(contaCorrente1.consultarSaldo())
    println(contaCorrente1.sacarSaldo(300.00))
    println(contaCorrente1.sacarSaldo(400.00))
    var cheque1 = Cheque(250.00, "Santander", "25/08/2020")
    println(contaCorrente1.depositarCheque(cheque1))
}