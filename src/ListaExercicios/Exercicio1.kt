package ListaExercicios
fun main(){
        println(comparaNumero(10,52,100))

    }
fun comparaNumero(a: Int, b: Int, c:Int):String{
    var teste = ""
    if(a>b && a>c){
        teste = "$a é o maior"
    }else if(b>a && b>c){
        teste = "$b é o maior"
    }else if(c>a && c>b){
        teste = "$c é o maior"
    }
    return teste
}
