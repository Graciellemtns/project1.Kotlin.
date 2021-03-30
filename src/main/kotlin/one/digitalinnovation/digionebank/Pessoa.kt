package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Mel"
    var cpf: String = "126.251.845-87"
    private set // para não conseguir alterar dentro da função o cpf e o nome

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val Mel = Pessoa()

    println(Mel.pessoaInfo())

}