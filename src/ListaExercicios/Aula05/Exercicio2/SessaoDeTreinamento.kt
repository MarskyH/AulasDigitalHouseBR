package ListaExercicios.Aula05.Exercicio2

class SessaoDeTreinamento(private var experiencia: Int) {
    fun treinarA(Jogador: JogadorDeFutebol): String{
        Jogador.correr()
        Jogador.fazerGol()
        Jogador.correr()
        return "Experiência Inicial: $experiencia" +
                "\nExperiência Final: ${experiencia + 1} "
    }

}