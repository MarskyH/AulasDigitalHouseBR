package ListaExercicios.Aula07.ExercicioSlack

class ItemVenda(var produto: String, var quantidade: Int, var valor: Double): IRecebivel {

    init{
        println("==================PRODUTO===================")
       println("Produto: $produto" +
               "\nQuantidade: $quantidade" +
               "\nValor: $valor")
    }
    override fun totalizarReceita(): Double {
        var total: Double = quantidade*valor
        return total
    }

    fun ToString():String{
        return "Total final: ${totalizarReceita().toString()}"
    }


}