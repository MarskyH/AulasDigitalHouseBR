package ListaExercicios.Aula05.Exercicio1

class Conta(val numero: Int, var saldo: Double, var titular: Cliente) {
    fun Depositar(valor: Double){
        saldo +=valor
        println("Tipo de transação: Deposito")
        println("Saldo atual: $saldo")
    }
    fun Sacar(valor: Double){
        if(saldo < valor){
            println("Saldo Insuficiente")
        }else
            saldo -=valor
        println("Tipo de transação: Saque")
        println("Saldo atual: $saldo")
    }

}