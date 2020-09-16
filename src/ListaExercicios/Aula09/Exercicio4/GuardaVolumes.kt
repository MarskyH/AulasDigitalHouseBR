package ListaExercicios.Aula09.Exercicio4

class GuardaVolumes() {
    var contador: Int = 1
    var volumesMap: HashMap<Int, List<Peca>> = HashMap()

    fun guardarPecas(listaDePeca:List<Peca>){
        volumesMap.put(contador, listaDePeca)
        println("Chave: $contador")
        contador += 1
    }
    fun mostrarListaPecas() {
        for (key in volumesMap) {
            println(key.toString())
        }
    }
    fun mostrarPecas(numero: Int) {
        println(volumesMap.getValue(numero))
    }
    fun devolverPecas(numero: Int){
        volumesMap.remove(numero)
        println("Lista removida")
    }

}