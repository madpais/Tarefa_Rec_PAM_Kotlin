// Classe Pessoa demonstrando encapsulamento
class Pessoa(
    private var nome: String,
    private var idade: Int
) {
    
    val ehMaiorDeIdade: Boolean
        get() = idade >= 18
    
    // Getter para nome (público)
    fun getNome(): String {
        return nome
    }
    
    // Setter para nome com validação (encapsulamento)
    fun setNome(novoNome: String) {
        if (novoNome.isNotBlank()) {
            nome = novoNome
        } else {
            println("Nome não pode estar vazio!")
        }
    }
    
    // Getter para idade
    fun getIdade(): Int {
        return idade
    }
    
    // Setter para idade com validação
    fun setIdade(novaIdade: Int) {
        if (novaIdade >= 0) {
            idade = novaIdade
        } else {
            println("Idade não pode ser negativa!")
        }
    }
    
    // Método para apresentar a pessoa
    fun apresentar() {
        println("Olá! Meu nome é $nome e tenho $idade anos.")
        if (ehMaiorDeIdade) {
            println("Sou maior de idade.")
        } else {
            println("Sou menor de idade.")
        }
    }
    
    // Método para fazer aniversário
    fun fazerAniversario() {
        idade++
        println("$nome fez aniversário! Agora tem $idade anos.")
    }
}