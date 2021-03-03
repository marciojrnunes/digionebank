package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-12"
        private set
}

fun main(){
    val jether = Pessoa()  //Variavel (objeto) jether recebe a instancia do classe Pessoa

    jether.nome = "4567"


    println(jether.nome)
    println(jether.cpf)


}