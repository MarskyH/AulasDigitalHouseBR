package ListaExercicios.Aula06.ExercicioSantander

abstract class Conta (var saldo: Double, var cliente: Cliente) {
    abstract fun sacarSaldo(valor: Double)
    abstract fun depositarSaldo(valor: Double)
    abstract fun consultarSaldo()

}