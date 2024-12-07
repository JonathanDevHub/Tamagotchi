fun main() {

    println("\nBem-vindo ao simulador de animal de estimação virtual!")
    println("\nRegras do jogo:")
    println("1. Seu pet possui três atributos principais: fome, felicidade e cansaço.")
    println("2. Alimentar o pet diminui sua fome.")
    println("3. Brincar com o pet aumenta sua felicidade, mas também aumenta o cansaço.")
    println("4. Descansar reduz o cansaço do pet.")
    println("5. A cada rodada, o tempo passa e a fome e o cansaço aumentam, enquanto a felicidade diminui.")
    println("6. Tente manter os atributos do seu pet equilibrados para que ele fique feliz e saudável.")

    print("\nEscolha um nome para o seu pet: ")
    val nomeDoPet = readLine() ?: "Pet"

    val pet = AnimalDeEstimacao(nomeDoPet)

    while (true) {

        println("\nO que você gostaria de fazer com $nomeDoPet?")
        println("1. Alimentar")
        println("2. Brincar")
        println("3. Descansar")
        println("4. Verificar Status")
        println("5. Passar tempo")
        println("6. Sair do jogo")

        print("Escolha uma opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> {
                print("Quantas horas deseja que $nomeDoPet descanse? ")
                val horas = readLine()?.toIntOrNull() ?: 1
                pet.descansar(horas) }
            4 -> pet.verificarStatus()
            5 -> pet.passarTempo()
            6 ->
            { println("\nObrigado por jogar! Até a próxima.")
                break }

            else -> println("\nOpção inválida, tente novamente.")
        }
    }
}

class AnimalDeEstimacao(val nome: String) {

    var fome: Int = 50
    var felicidade: Int = 50
    var cansaço: Int = 0
    var idade: Int = 0

    fun alimentar() {
        fome = (fome - 10).coerceAtLeast(0)
        println("\n$nome foi alimentado. Fome agora é $fome.")
    }

    fun brincar() {
        felicidade = (felicidade + 10).coerceAtMost(100)
        cansaço = (cansaço + 10).coerceAtMost(100)
        println("\n$nome brincou. Felicidade agora é $felicidade e cansaço é $cansaço.")
    }

    fun descansar(horas: Int) {
        cansaço = (cansaço - horas * 10).coerceAtLeast(0)
        println("\n$nome descansou por $horas horas. Cansaço agora é $cansaço.")
    }

    fun verificarStatus() {
        println("\nStatus de $nome: Fome = $fome, Felicidade = $felicidade, Cansaço = $cansaço, Idade = $idade")
    }

    fun passarTempo() {
        idade++
        fome = (fome + 3).coerceAtMost(100)
        felicidade = (felicidade - 3).coerceAtLeast(0)
        cansaço = (cansaço + 10).coerceAtMost(100)
        println("\nO tempo passou. Idade de $nome é agora $idade, Fome = $fome, Felicidade = $felicidade, Cansaço = $cansaço")
    }
}
    //Tamagotchi - Versão Alternativa
    fun main() {
        println("\nBem-vindo ao simulador de animal de estimação virtual!")
        println("\nRegras do jogo:")
        println("1. Seu pet possui três atributos principais: fome, felicidade e cansaço.")
        println("2. Alimentar o pet diminui sua fome.")
        println("3. Brincar com o pet aumenta sua felicidade, mas também aumenta o cansaço.")
        println("4. Descansar reduz o cansaço do pet.")
        println("5. A cada rodada, o tempo passa e a fome e o cansaço aumentam, enquanto a felicidade diminui.")
        println("6. Tente manter os atributos do seu pet equilibrados para que ele fique feliz e saudável.")

        print("\nEscolha um nome para o seu pet: ")
        val nomeDoPet = readLine() ?: "Pet"

        val pet = AnimalDeEstimacao(nomeDoPet)

        while (true) {
            println("\nO que você gostaria de fazer com $nomeDoPet?")
            println("1. Alimentar")
            println("2. Brincar")
            println("3. Descansar")
            println("4. Verificar Status")
            println("5. Passar tempo")
            println("6. Sair do jogo")

            print("Escolha uma opção: ")
            when (readLine()?.toIntOrNull()) {
                1 -> pet.alimentar()
                2 -> pet.brincar()
                3 -> {
                    print("Quantas horas deseja que $nomeDoPet descanse? ")
                    val horas = readLine()?.toIntOrNull() ?: 1
                    pet.descansar(horas)
                }
                4 -> pet.verificarStatus()
                5 -> pet.passarTempo()
                6 -> {
                    println("\nObrigado por jogar! Até a próxima.")
                    break
                }
                else -> println("\nOpção inválida, tente novamente.")
            }
        }
    }

class AnimalDeEstimacao(val nome: String) {

    var fome: Int = 50
    var felicidade: Int = 50
    var cansaço: Int = 0
    var idade: Int = 0

    fun alimentar() {
        fome = (fome - 10).coerceAtLeast(0)
        println("\n$nome foi alimentado. Fome agora é $fome.")
    }

    fun brincar() {
        felicidade = (felicidade + 10).coerceAtMost(100)
        cansaço = (cansaço + 10).coerceAtMost(100)
        println("\n$nome brincou. Felicidade agora é $felicidade e cansaço é $cansaço.")
    }

    fun descansar(horas: Int) {
        cansaço = (cansaço - horas * 10).coerceAtLeast(0)
        println("\n$nome descansou por $horas horas. Cansaço agora é $cansaço.")
    }

    fun verificarStatus() {
        println("\nStatus de $nome: Fome = $fome, Felicidade = $felicidade, Cansaço = $cansaço, Idade = $idade")
    }

    fun passarTempo() {
        idade++
        fome = (fome + 3).coerceAtMost(100)
        felicidade = (felicidade - 3).coerceAtLeast(0)
        cansaço = (cansaço + 10).coerceAtMost(100)
        println("\nO tempo passou. Idade de $nome é agora $idade, Fome = $fome, Felicidade = $felicidade, Cansaço = $cansaço")
    }
}
    //Alterações realizadas:
    //Formatação e Indentação: Melhorei a formatação do código para torná-lo mais limpo e organizado.
    //Adição de Comentários: Adicionei comentários para descrever as regras do jogo e a lógica do programa, tornando-o mais fácil de entender para quem está lendo o código.