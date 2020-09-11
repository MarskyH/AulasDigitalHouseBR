package ListaExercicios.Aula06.ExercicioSantander

class ContaPoupanca(saldo: Double, cliente: Cliente): Conta(saldo, cliente) {
    init {
        println("----------------------------------SISTEMA DE CONTA POUPANÇA----------------------------------")
        println("Numero: ${cliente.numero}")
        println("Cliente: ${cliente.nome} ${cliente.sobrenome}")
    }
    override fun sacarSaldo(valor: Double) {
        println("----------------------------------SISTEMA DE SAQUE----------------------------------")
        if(valor>saldo){
            println("Valor superior ao saldo disponível. Saque Negado!")
        }else{
            println("Saldo:${saldo}")
            println("Valor Sacado:${valor}")
            println("Saldo Atual:${saldo-valor}")
            saldo -=valor
        }
    }

    override fun depositarSaldo(valor: Double) {
        println("----------------------------------SISTEMA DE DEPOSITO----------------------------------")
        println("Saldo:${saldo}")
        println("Valor Depositado:${valor}")
        println("Saldo Atual:${saldo+valor}")
        saldo +=valor
    }

    override fun consultarSaldo() {
        println("----------------------------------SISTEMA DE CONSULTA----------------------------------")
        println("Saldo Atual: ${saldo}")
    }
    fun recolherJuros(){
        var taxaJuros = 5.00
        var juros:Double = saldo*(taxaJuros/100)
        println("----------------------------------SISTEMA DE JUROS----------------------------------")
        println("O Valor total em conta: ${saldo} ")
        println("O Valor diponível para recolher: ${juros}")
        println("Saldo atual: ${saldo-juros}")
        saldo -=juros
    }
}