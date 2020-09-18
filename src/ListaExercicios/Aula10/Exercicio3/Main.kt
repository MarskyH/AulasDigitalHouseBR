package ListaExercicios.Aula10.Exercicio3

fun main(){
    val aluno1 = Aluno("Marcus", 123456)
    val aluno2 = Aluno("Felipe", 245251)
    val aluno3 = Aluno("Julia", 278687)
    val aluno4 = Aluno("Ana", 121843)

    val lista = listOf<Aluno>(aluno1, aluno2, aluno3, aluno4)

    val alunoNovo = Aluno("Maria", 121843)
    println(lista.contains(alunoNovo))
    println(lista.equals(alunoNovo))


}