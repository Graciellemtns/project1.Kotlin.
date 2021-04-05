package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main (){
    val joao = Analista(nome = "Joao Carlos", cpf = "145.265.847.54", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(joao)
}
