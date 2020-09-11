package ListaExercicios.Aula06.ExercicioIngresso

class Normal(valor: Double): Ingresso(valor) {
    fun imprimeIngresso(){
        println("Ingresso Normal")
        super.imprimeValor()
    }

}