package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-12"
        private set

    fun pessoaInfo() = "$nome e cpf: $cpf"

}

fun main(){
    val jether = Pessoa()  //Variavel (objeto) jether recebe a instancia do classe Pessoa

    println(jether.nome)
    println(jether.cpf)

    println(Pessoa().pessoaInfo())


}