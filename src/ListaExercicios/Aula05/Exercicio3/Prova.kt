package ListaExercicios.Aula05.Exercicio3

class Prova(var dificuldade: Int, var energiaNecessaria: Int ) {

    fun PodeRealizar(atleta: Atleta): Boolean {
        var resposta: Boolean
        when{
            (atleta.energia >= energiaNecessaria) && (atleta.nivel >= dificuldade) -> resposta = true
                else ->{
                    resposta = false
                }
        }
            return resposta
        }
    }
