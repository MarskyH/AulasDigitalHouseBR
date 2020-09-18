package ListaExercicios.Aula10.Exercicio4

import ListaExercicios.Aula10.Exercicio3.Aluno

class Funcionario(val nome: String, val numeroRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        return(other is Funcionario) && (numeroRegistro == other.numeroRegistro)
    }
}