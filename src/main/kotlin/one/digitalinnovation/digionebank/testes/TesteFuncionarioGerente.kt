package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {

    val fernando = Gerente("Fernando Benhossi", "123.456.789.01",5000.00)
    imprimeRelatorioFuncionario.imprime(fernando)

}

