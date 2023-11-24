programa
{
	
	funcao inicio()
	{
		cadeia nomes[3] = {"Amanda", "Renato", "Agatha"}
		real notas[3][4] = {{10.0,10.0,9.0,10.0},
						{9.0,7.0,8.0,7.0},
						{9.0,10.0,9.0,10.0}}
		real medias[3]

		para(inteiro l=0; l<3; l++){
			real soma = 0.0
			para(inteiro c=0; c<4; c++){
				soma = soma + notas[l][c] // tem como encurtar fazendo: sum+= notas[l][c]	
			}
			medias[l] = soma/4
		}

		inteiro aluno
		escreva("Digite o número do aluno: ")
		leia(aluno)
		limpa()
		
		cadeia apr
		se(medias[aluno]>=6){
			apr="Aprovado"
		}senao{
			apr="Reprovado"
		}

		escreva("Aluno(a): "+nomes[aluno],"\n")
		escreva("1B: "+notas[aluno][0],"\n")
		escreva("2B: "+notas[aluno][1],"\n")
		escreva("3B: "+notas[aluno][2],"\n")
		escreva("4B: "+notas[aluno][3],"\n")
		escreva("---------------------","\n")
		escreva("Média: "+medias[aluno],"\n")
		escreva("    "+apr,"\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 866; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nomes, 6, 9, 5}-{notas, 7, 7, 5}-{medias, 10, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */