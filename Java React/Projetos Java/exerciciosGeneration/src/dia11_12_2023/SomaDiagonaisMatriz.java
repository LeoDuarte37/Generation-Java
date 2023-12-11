package dia11_12_2023;

import java.util.Scanner;

public class SomaDiagonaisMatriz {

	public static void main(String[] args) {
		
		int numeros[][] = new int[3][3];
		int somaPrimeira = 0, somaSegunda = 0, decremento = 2; 
		
		Scanner ler = new Scanner(System.in);
		
		for (int l = 0; l < numeros.length; l++) {
			for (int c = 0; c < numeros.length; c++) {
				System.out.println("\nDigite o valor da linha " + l + ", coluna " + c);
				numeros[l][c] = ler.nextInt();				
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal:");
		for (int l = 0; l < numeros.length; l++) {
			System.out.println(numeros[l][l]);
			somaPrimeira += numeros[l][l];
		}
		
		System.out.println("\nElementos da Diagonal Secundária:");
		for (int l = 0; l < numeros.length; l++) {
			System.out.println(numeros[l][decremento]);
			somaSegunda += numeros[l][decremento];
			
			decremento--;
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrimeira);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSegunda);
	}

}
