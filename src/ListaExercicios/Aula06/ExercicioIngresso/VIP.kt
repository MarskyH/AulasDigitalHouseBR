package ListaExercicios.Aula06.ExercicioIngresso

open class VIP(valor: Double, var localizacao: String): Ingresso(valor) {

    override fun imprimeValor(){
        println("Valor do ingresso: $valor")
        println("Adicional VIP: R$ 10,00")
        println("Valor total: ${valor+10.00}")
    }
}