programa {
  funcao inicio() {
    real num 
    logico divisivel

    escreva("Digite um n�mero: ")
    leia(num)

    se (num % 4 == 0 ou num % 9 == 0) {
      divisivel = verdadeiro
      escreva(divisivel)
    } senao {
      divisivel = falso
      escreva(divisivel)
    }
  }
}
