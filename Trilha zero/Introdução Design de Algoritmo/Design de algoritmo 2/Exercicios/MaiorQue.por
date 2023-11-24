programa {
  funcao inicio() {
    real numero
    logico maiorQue

    escreva("Digite um número: ")
    leia(numero)

    se (numero > 10) {
      maiorQue = verdadeiro
      escreva(maiorQue)
    } senao {
      maiorQue = falso
      escreva(maiorQue)
    }
  }
}
