package ListaExercicios.Aula05.Exercicio5

class Concessionaria(var NomeEmpresa: String) {
    fun registrarVenda(venda: Venda): String {
        return ("Nova venda inserida:" +
                "\nNome Emrpesa: $NomeEmpresa" +
                "\nCliente: ${venda.Cliente.nome}" +
                "\nVeículo: ${venda.Veiculo.modelo}" +
                "\nValor: ${venda.valorVenda}")
    }

}