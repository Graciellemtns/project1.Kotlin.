package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val timao = Analista("Timão Martins", "123.456.789.01",5000.00)
    imprimeRelatorio(timao)

}
    fun imprimeRelatorio(funcionario: Funcionario)= println(funcionario.toString())
