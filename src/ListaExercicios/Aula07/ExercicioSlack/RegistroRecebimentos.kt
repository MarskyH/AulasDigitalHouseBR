package ListaExercicios.Aula07.ExercicioSlack

class RegistroRecebimentos {
    var listaRecebimentos = mutableListOf<IRecebivel>()
    fun registrarRecebimentos(){
        println("Registro realizado com sucesso!")
    }
    fun adicionarRecebimentos(r:IRecebivel){
        registrarRecebimentos()
        listaRecebimentos.add(r)
    }

    fun apresentarRecebimentos(){
        var totalRecebimentos:Double = 0.0
        for(lista: IRecebivel in listaRecebimentos ){
           lista.totalizarReceita()
          totalRecebimentos =+ lista.totalizarReceita()
        }
        println("Total de Recebimentos:$totalRecebimentos")

    }
}