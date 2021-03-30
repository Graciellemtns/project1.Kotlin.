package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val Mel = Pessoa(nome = "Mel Martins", cpf = "123.456.789.01")

    println(Mel.nome)
    println(Mel.cpf)

    val timao = Funcionario("Mel Martins", "123.456.789.01",BigDecimal.valueOf(5000.00))
    println(timao.nome)
    println(timao.cpf)
    println(timao.salario)
}