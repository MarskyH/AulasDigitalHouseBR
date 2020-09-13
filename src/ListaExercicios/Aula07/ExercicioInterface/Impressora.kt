package ListaExercicios.Aula07.ExercicioInterface

class Impressora {
    var listaimprimivel = mutableListOf<Imprimivel>()

    fun adicionarNaLista(i: Imprimivel){
        listaimprimivel.add(i)
    }
    fun imprimirListaImprimivel(){
        for(lista: Imprimivel in listaimprimivel){
            println(lista.nome+"."+lista.tipoDocumento)
        }
    }
}