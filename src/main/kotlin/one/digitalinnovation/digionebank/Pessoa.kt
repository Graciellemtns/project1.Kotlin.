package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Mel"
    var cpf: String = "126.251.845-87"
    private set // não conseguir alterar dentro da função o cpf e o nome

}

fun main() {
    val Mel = Pessoa()

    //println(Mel)
    println(Mel.nome)
    println(Mel.cpf)



}