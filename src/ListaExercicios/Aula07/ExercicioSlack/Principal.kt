package ListaExercicios.Aula07.ExercicioSlack

fun main(){
    val registro1 = RegistroRecebimentos()
    val produto1 = ItemVenda("Smartphone Samsung", 5, 950.00)
    registro1.adicionarRecebimentos(produto1)
    produto1.totalizarReceita()
    val servico1 = Servico("Limpeza completa de PC", 5, 50.00)
    registro1.adicionarRecebimentos(servico1)
    servico1.totalizarReceita()
    println("=============REGISTRO===============")
    println(registro1.apresentarRecebimentos())
}