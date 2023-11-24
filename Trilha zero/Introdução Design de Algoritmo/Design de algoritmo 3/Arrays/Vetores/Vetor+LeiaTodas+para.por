programa
{
	
	funcao inicio()
	{
		cadeia nome[5]
		inteiro c
		
		para(c=0 ; c<=4 ; c++)
		{
			escreva("Digite a posição "+c+": ")
			leia(nome[c])
			limpa()
		}

		para(c=0 ; c<=4 ; c++)
		{
			escreva( c + ": "+ nome[c]+ " / ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */