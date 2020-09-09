package ListaExercicios.Aula04
fun main(){
    println(verificaPar(4))
}
fun verificaPar(numero: Int): Boolean{
    var teste = true
    if(numero % 2 == 0){
    teste = true
    }else {
        teste = false
    }
    return teste
}