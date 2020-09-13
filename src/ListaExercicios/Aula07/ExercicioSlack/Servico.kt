package ListaExercicios.Aula07.ExercicioSlack

class Servico(var descricao: String, var horas: Int, var precoHora: Double) : IRecebivel {

    init{
        println("==================SERVIÇO===================")
        println("Descricao: $descricao" +
                "\nQuantidade de Horas: $horas" +
                "\nValor: $precoHora")
}

    override fun totalizarReceita(): Double {
        var total: Double = horas*precoHora
        return total
    }

    fun ToString():String{
        return "Total final: ${totalizarReceita().toString()}"
    }

}