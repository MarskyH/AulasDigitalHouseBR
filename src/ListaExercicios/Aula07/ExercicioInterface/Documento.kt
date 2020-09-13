package ListaExercicios.Aula07.ExercicioInterface

class Documento : Imprimivel {
    override val nome: String
    get() = "Documento"
    override val tipoDocumento: String
    get() = "docx"

    override fun imprimir(){
       println("====================DOCUMENTO=====================")
       println("Eu sou um documento Word" +
               "\nNome: $nome" +
               "\nTipo de Documento: $tipoDocumento ")
    }
}