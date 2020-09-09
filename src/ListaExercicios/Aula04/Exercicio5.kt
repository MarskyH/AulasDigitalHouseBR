package ListaExercicios.Aula04

fun main(){
    println(analisarNumeros(100, 200, 50, 45))
}
fun analisarNumeros(numA: Int, numB:Int, numC:Int, numD:Int): Boolean{
    return (numA > numC && numA > numD || numB > numC && numB > numD)

}

