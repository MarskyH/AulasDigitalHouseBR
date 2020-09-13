package ListaExercicios.Aula07.ExercicioInterface

class Contrato : Imprimivel {
    override val nome: String
    get() = "Contrato"
    override val tipoDocumento: String
    get() = "docx"

    override fun imprimir() {
        println("====================CONTRATO=====================")
        println("Sou um contrato muito legal" +
                "\nNome: $nome" +
                "\nTipo de Documento: $tipoDocumento ")
    }
}