package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main (){
    val jana = Cliente(
        nome = "Jana Melo",
        cpf = "1254.5653.84",
        clienteTipo = ClienteTipo.PF,
        senha = "456789"
    )
    println(jana)

    TesteAutenticacao().autentica(jana)
}
