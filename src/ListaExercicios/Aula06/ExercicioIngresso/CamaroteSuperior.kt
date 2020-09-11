package ListaExercicios.Aula06.ExercicioIngresso

class CamaroteSuperior(valor: Double, localizacao: String): VIP(valor, localizacao) {
    fun imprimeSuperior(){
        println("Valor do Ingresso: R$ $valor")
        println("Valor adicional VIP: R$ 10.00")
        println("Valor adicional Camarote Superior: R$ 35.00")
        println("Valor Total: ${valor+10.00+35.00}")
        println("Localização: $localizacao")
    }
}
