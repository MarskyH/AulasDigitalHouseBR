package ListaExercicios.Aula10.Exercicio4
fun main(){
    val funcionario1 = Funcionario("Marcus", 1256)
    val funcionario2 = Funcionario("Felipe", 2451)
    val funcionario3 = Funcionario("Julia", 2787)
    val funcionario4 = Funcionario("Ana", 1243)

    val lista = listOf<Funcionario>(funcionario1, funcionario2,funcionario3, funcionario4)

    val funcionarioNovo = Funcionario("Maria", 1243)
    println(lista.contains(funcionarioNovo))



}