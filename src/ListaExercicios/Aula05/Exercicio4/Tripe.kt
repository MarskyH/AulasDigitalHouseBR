package ListaExercicios.Aula05.Exercicio4

class Tripe (var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int){
    fun definirAltura(novaAltura: Int){
        println("A altura atual era: $alturaAtual")
        alturaAtual = novaAltura
        println("A altura atual agora é: $novaAltura")

    }
    fun dobrar(escolha: Int): Boolean{
        var resultado = false
        when(escolha){
            1 -> {
                println("Tripé foi dobrado.")
                resultado = true
            }
            2 -> {
                println("Tripé não foi dobrado.")
                resultado = false
            }
        }
        return resultado
    }
    fun desdobrar(escolha: Int): Boolean{
        var resultado = false
        when(escolha){
            1 -> {
                println("Tripé foi desdobrado.")
                resultado = true
            }
            2 -> {
                println("Tripé não foi desdobrado.")
                resultado = false
            }
        }
        return resultado
    }
    fun guardar(escolha: Int): Boolean{
        var resultado: Boolean
        resultado = dobrar(escolha) && alturaAtual == alturaMinima
        return resultado
    }
    fun prontoParaGuardar(escolha: Int): Boolean{
        var resultado: Boolean
        resultado = guardar(escolha)
        return resultado
    }
    fun usar(escolha: Int):Boolean{
        var resultado: Boolean
        resultado = desdobrar(escolha) && alturaAtual > alturaMaxima/2
        return resultado
    }
    fun prontoParaUsar(escolha: Int): Boolean{
        var resultado: Boolean
        resultado = usar(escolha)
        return resultado
    }
}