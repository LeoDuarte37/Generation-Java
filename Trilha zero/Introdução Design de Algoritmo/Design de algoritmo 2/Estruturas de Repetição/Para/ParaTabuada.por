programa
{
	
	funcao inicio()
	{
		inteiro x, tab, res
		
		escreva("Qual tabauda você quer ver? ")
		leia(tab)

		para(x=1;x<=10;x++) //x++ funciona como um adicionador do contador (x = x + 1)
		{
			res= x * tab
			escreva("\n",x," X ",tab," = ",res)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */