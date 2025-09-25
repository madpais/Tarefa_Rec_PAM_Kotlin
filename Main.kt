fun main() {
    println("=== Projeto Kotlin - Exemplo de Encapsulamento ===\n")
    
    
    val pessoa1 = Pessoa("Ana", 25)
    val pessoa2 = Pessoa("João", 16)
    val pessoa3 = Pessoa("Maria", 30)
    
   
    println("--- Apresentações iniciais ---")
    pessoa1.apresentar()
    println()
    pessoa2.apresentar()
    println()
    pessoa3.apresentar()
    println()
    
    
    println("--- Testando encapsulamento ---")
    pessoa1.setNome("Ana Silva")
    pessoa1.apresentar()
    println()
    
    
    pessoa2.setNome("")
    println()
    
    
    pessoa3.setIdade(-5)
    println()
    
    
    println("--- Aniversários ---")
    pessoa2.fazerAniversario()
    pessoa2.apresentar()
    println()
    
    
    println("--- Informações das pessoas ---")
    println("${pessoa1.getNome()} tem ${pessoa1.getIdade()} anos")
    println("${pessoa2.getNome()} tem ${pessoa2.getIdade()} anos")
    println("${pessoa3.getNome()} tem ${pessoa3.getIdade()} anos")
}