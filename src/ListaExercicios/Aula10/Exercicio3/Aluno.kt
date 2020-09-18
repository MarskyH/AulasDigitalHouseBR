package ListaExercicios.Aula10.Exercicio3

data class Aluno(val nome: String, val numeroDeAluno: Int) {

  override fun equals(other: Any?): Boolean {
       return(other is Aluno) && (numeroDeAluno == other.numeroDeAluno)
    }

}