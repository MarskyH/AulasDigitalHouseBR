package br.com.digitalhouse.olamundo

fun main() {
        println("Olá Mundo!")
        println(mostarMeuNome( "Loureiro",  18))
        println("---------------------------------------------")
        println("LISTA DE ALUNOS")
        println("---------------------------------------------")
        println(alunosDeAndroid())

//    for (nome in 0 .. alunosDeAndroid().size-1){
//        println("Nome do aluno: ${alunosDeAndroid()[nome]}")
//    }
    for(nome in alunosDeAndroid())
        println(nome)
}

fun mostarMeuNome(sobrenome: String, idade: Int) : String{

    val idadeRecebida = when (idade) {
        18 -> "tem 18 anos"
        20 -> "tem 20 anos"
        30 -> "tem 30 anos"
        else -> "não se sabe a idade"
    }

    return "Marcus $sobrenome e $idadeRecebida"
}

fun alunosDeAndroid(): ArrayList<String>{
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Wagner")
    listaAlunos.add("Vitória")
    listaAlunos.add("João")
    listaAlunos.add("André")


    return listaAlunos

}
