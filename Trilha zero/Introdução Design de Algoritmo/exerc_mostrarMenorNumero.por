programa
{
	
	funcao inicio()
	{
		inteiro vetor[5] = {-1, 3, 4, 2, 6}
		
		inteiro menor = vetor[0]
		
		para(inteiro p = 0; p < 5; p++){	
			se(vetor[p] < menor) {
				menor = vetor[p]
			}
		}

		escreva(menor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */