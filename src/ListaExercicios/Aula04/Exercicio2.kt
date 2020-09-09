package ListaExercicios.Aula04
fun main(){
    println(compareTextos("Marcus", "Marcus"))
}
fun compareTextos(texto1: String, texto2: String):Boolean{
    var teste = true
    if(texto1 == texto2){
        teste = true
    }else{
        teste = false
    }
    return teste
}
