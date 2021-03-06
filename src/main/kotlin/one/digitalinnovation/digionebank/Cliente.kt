package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf ), Logavel {
    override fun login(): Boolean = "23456" == senha

    override fun toString(): String = """
            Nome:        $nome
            CPF:         $cpf
            Cliente:     ${clienteTipo.descricao}
    """.trimIndent()

}