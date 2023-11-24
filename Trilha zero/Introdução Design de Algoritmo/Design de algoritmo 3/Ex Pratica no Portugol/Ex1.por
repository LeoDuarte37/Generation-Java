programa
{
	
	funcao inicio()
	{
		inteiro vetor[10] = {2,5,1,3,4,9,7,8,10,6}

		para(inteiro p=9; p>=0; p--){
			
			para(inteiro c=p; c>=0; c--){
				inteiro menor = 0
				se(vetor[p] > vetor[c]){
					menor = vetor[c]
					vetor[c] = vetor[p]
					vetor[p] = menor
				}
			}
			
		}
		
		para(inteiro p=0; p<=9; p++){
			escreva(vetor[p], "/")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */