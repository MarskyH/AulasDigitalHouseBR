package ListaExercicios.Aula06.ExercicioIngresso

class CamaroteInferior(valor: Double, localizacao: String): VIP(valor, localizacao) {
    fun imprimeInferior(){
        println("Valor do Ingresso: R$ $valor")
        println("Valor adicional VIP: R$ 10.00")
        println("Localização: $localizacao")
    }
}