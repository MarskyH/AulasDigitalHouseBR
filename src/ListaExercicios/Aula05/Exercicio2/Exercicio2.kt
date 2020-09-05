package ListaExercicios.Aula05.Exercicio2



fun main(){
    val jogador1 = JogadorDeFutebol("Paulo",100,40,0,50)
    val jogador2 = JogadorDeFutebol("Felipe",80,60,2,70)
    val sessaoDeTreinamento1 = SessaoDeTreinamento(jogador1.experiencia)
    val sessaoDeTreinamento2 = SessaoDeTreinamento(jogador2.experiencia)
    println("Jogador ${jogador1.nome}")
    println(sessaoDeTreinamento1.treinarA(jogador1))
    println("Jogador ${jogador2.nome}")
    println(sessaoDeTreinamento2.treinarA(jogador2))

}
