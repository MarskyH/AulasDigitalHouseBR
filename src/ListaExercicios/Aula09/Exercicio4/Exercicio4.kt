package ListaExercicios.Aula09.Exercicio4

fun main(){
 val volume1 = Volume("Nike", "Tênis")
 val volume2 = Volume("Dell", "Notebook")
 val listaVolumes: List<Peca> = listOf(volume1, volume2)
    val guardaVolumes = GuardaVolumes()
    guardaVolumes.guardarPecas(listaVolumes)
    guardaVolumes.mostrarListaPecas(listaVolumes)
    guardaVolumes.mostrarPecas(1)
    guardaVolumes.devolverPecas(1)

}