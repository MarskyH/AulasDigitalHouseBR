package ListaExercicios.Aula06.Exercicio2

class Aposentado(var nome: String, var sobrenome: String, var idade: Int, var anosContribuicao: Int, var sexo: String) {
    init{
        println("Sistema de Aposentadoria iniciado..." +
                "\nDados inseridos:" +
                "\nNome: $nome $sobrenome" +
                "\nIdade: $idade" +
                "\nSexo: $sexo"+
                "\nAnos de Contribuição: $anosContribuicao")

    }
    fun testarBeneficio(aposentado: Aposentado) {
        if (aposentado.sexo == "M" && aposentado.anosContribuicao >= 30 && aposentado.idade >= 65) {
            println("O ${aposentado.nome} ${aposentado.sobrenome} tem direito de se aposentar")
        } else if (aposentado.sexo == "F" && aposentado.anosContribuicao >= 30 && aposentado.idade >= 60) {
            println("O(a) Solicitante ${aposentado.nome} ${aposentado.sobrenome} tem direito de se aposentar")
        }else{
            println("O(a) Solicitante ${aposentado.nome} ${aposentado.sobrenome} não tem direito de se aposentar")
        }
    }
}