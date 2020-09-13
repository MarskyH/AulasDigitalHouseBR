package ListaExercicios.Aula07.ExercicioInterface

fun main(){
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()
    val impressora = Impressora()
    impressora.adicionarNaLista(foto)
    impressora.adicionarNaLista(documento)
    impressora.adicionarNaLista(contrato)
    println(impressora.imprimirListaImprimivel())
}