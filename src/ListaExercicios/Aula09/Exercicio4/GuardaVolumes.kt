package ListaExercicios.Aula09.Exercicio4

class GuardaVolumes() {
    var contador: Int = 1
    var volumesMap: HashMap<Int, List<Peca>> = HashMap()

    fun guardarPecas(listaDePeca:List<Peca>){
        volumesMap.put(contador, listaDePeca)
        println("Chave: $contador")
        contador += 1
    }
    fun mostrarListaPecas(listaDePeca: List<Peca>) {
        volumesMap.forEach(){
            println("Numero de identificação: ${it.key}")
            for(i in 0..volumesMap.size-1){
                println("${it.value[i].marca} ${it.value[i].modelo}")
            }
            println("\n")
        }
    }
    fun mostrarPecas(numero: Int) {
        for(i in 0..volumesMap.getValue(numero).size-1){
            println(volumesMap.getValue(numero)[i].marca)
            println(volumesMap.getValue(numero)[i].modelo)
        }
    }
    fun devolverPecas(numero: Int){
        volumesMap.remove(numero)
        println("Lista removida")
    }

}