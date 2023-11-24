programa {
  funcao inicio() {
    real valores[3] = {250.50, 500, 30.45}
    real maiorValor = valores[0]

    para (inteiro i = 0; i < 3; i++) {
      se (valores[i] > maiorValor) {
        maiorValor = valores[i]
      }
    }

    escreva("O maior valor é: ", maiorValor)
  }
}
