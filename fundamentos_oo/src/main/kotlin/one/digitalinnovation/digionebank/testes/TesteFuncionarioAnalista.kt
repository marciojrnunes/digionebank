package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista(nome = "Joao Rodrigues", cpf = "987654321-99", 2000.0)
    //println(joao.nome)
    //println(joao.cpf)
    //println(joao.salario)

    ImprimeRelatorioFuncionario.imprime(joao)
    //println(joao.toString())

}
