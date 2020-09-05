package ListaExercicios.Aula05.Exercicio3

fun main(){
    val atleta1 = Atleta("Luccas", 10, 50)
    val provaFacil = Prova(5, 20)
    val provaMedia = Prova(10, 40)
    val provaDificil = Prova(20, 60)
    println(provaFacil.PodeRealizar(atleta1))
    println(provaMedia.PodeRealizar(atleta1))
    println(provaDificil.PodeRealizar(atleta1))


}