package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {  //Herança: Herdando uma classe abstrata funcionário e uma interface Logavel
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}