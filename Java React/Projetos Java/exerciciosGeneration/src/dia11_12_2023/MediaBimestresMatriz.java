package dia11_12_2023;

import java.util.Scanner;

public class MediaBimestresMatriz {

	public static void main(String[] args) {
		
		float notas[][] = new float[10][4];
		float media[] 	= new float[10];
		float soma = 0; 
		
		Scanner ler = new Scanner(System.in);

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("\nDigite a " + coluna + "° nota do " + linha + "° aluno");
				notas[linha][coluna] = ler.nextFloat();
				
				soma += notas[linha][coluna];
			}
			
			media[linha] = soma / 4;
			soma = 0;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("\nMédia do " + i + "° aluno: %.1f", media[i]);
			
			/*
			 *  printf + %.1f 	Arredonda o número float ou double.
			 *  
			 *  O .1 no "%.1f" é quantas casas decimais após a 
			 *  virgula, irá aparecer e arredondar.
			 */
			
		}
	}

}
