package ListaExercicios.Aula07.ExercicioInterface

class Foto(): Imprimivel {
    override val nome: String
        get() = "Foto"
    override val tipoDocumento: String
        get() = "jpeg"

    override fun imprimir() {
        println("====================FOTO=====================")
        println("Eu sou uma selfie" +
                "\nNome: $nome" +
                "\nTipo de Documento: $tipoDocumento ")
    }
}