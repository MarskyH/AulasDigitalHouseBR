package ListaExercicios.Aula11.Exercicio3

class CalculoMatematico {
    fun divisao(a: Int, b: Int): Int{
        try {
            return (a/b)
        }catch (ex: ArithmeticException){
            println("A operação não pode ser realizada")
            return 0
        }

    }


}