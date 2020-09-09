package ListaExercicios.Aula06.Exercicio1

class NumeroFatorial(var numero: Int) {
    fun fatorar(){
        var resultado: Int = 1
       // print("A fatoração de $numero! é: $numero*")
        for (i in numero downTo 1 ){
            if(i-1 > 1){
                println(i)
                println("($i * (${i - 1}))")
                resultado = (resultado + (i * (i - 1)))
                println(resultado)
            }
//            if(i-1 > 1) {
//                print("${i - 1}*")
//            }else if(i-1 == 1){
//                print("${i-1}=")
//            }
       }
        println("${resultado-1}")
    }
}