programa
{
	
	funcao inicio()
	{
		inteiro vetor[10]
		real soma = 0.0
		 	
		escreva("Digite 10 números para o vetor: ")
		
		para(inteiro c=0; c<=9; c++){
			 escreva("\n", c+1,":")
			 leia(vetor[c])

			 soma = soma + vetor[c]
		}
		
		real media = soma/10
		limpa()

		escreva("Elementos do indices ímpares: ")
		para(inteiro c = 1; c <= 9; c += 2){
			escreva(vetor[c], " ")
		}
		
		escreva("\nElementos pares: ")
		para(inteiro c = 0; c <= 9; c++){
			se (vetor[c] % 2 == 0) {
				escreva(vetor[c], " ")
			}
		}
		
		escreva("\nSoma: "+soma)
		escreva("\nMédia: "+media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 6, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */