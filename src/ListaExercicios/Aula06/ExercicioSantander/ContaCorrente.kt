package ListaExercicios.Aula06.ExercicioSantander

import java.util.*

class ContaCorrente(saldo: Double, var limiteChequeEpecial: Double, cliente: Cliente): Conta(saldo, cliente) {
    init {
        println("----------------------------------SISTEMA DE CONTA CORRENTE----------------------------------")
        println("Numero: ${cliente.numero}")
        println("Cliente: ${cliente.nome} ${cliente.sobrenome}")
    }
    override fun sacarSaldo(valor: Double) {
        println("----------------------------------SISTEMA DE SAQUE----------------------------------")
        var scanner = Scanner(System.`in`)
        if(valor>saldo){
            println("Valor superior ao saldo disponível. Saque Negado!")
            println("Deseja usar o seu limite do cheque especial?")
            var escolha:String = scanner.next()
            if(escolha == "Sim"){
                println("Limite Cheque Especial:${limiteChequeEpecial}")
                println("Valor Sacado:${valor}")
                println("Limite Cheque Especial Atual:${limiteChequeEpecial-valor}")
                limiteChequeEpecial -=valor
            }else{
                println("Operação Encerrada!")
            }
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
     fun depositarCheque(cheque: Cheque) {
         println("----------------------------------SISTEMA DE CHEQUE----------------------------------")
       println("Valor do Cheque:${cheque.valor}")
       println("Banco Emissor:${cheque.bancoEmissor}")
       println("Data de Pagamento:${cheque.dataPagamento}")
         println("Saldo:${saldo}")
         println("Valor Depositado:${cheque.valor}")
         println("Saldo Atual:${saldo+cheque.valor}")
         saldo +=cheque.valor
    }

    override fun consultarSaldo() {
        println("----------------------------------SISTEMA DE CONSULTA----------------------------------")
        println("Saldo Atual: ${saldo}")
    }
}