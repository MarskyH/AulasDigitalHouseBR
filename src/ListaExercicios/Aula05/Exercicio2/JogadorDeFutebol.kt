package ListaExercicios.Aula05.Exercicio2

class JogadorDeFutebol(val nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol(): String{
        experiencia -= 5
        alegria += 10
        gols += 1
        return "GOOOOOL!"
    }
    fun correr(): String{
        energia -= 10
        return "Cansei"
    }


}
