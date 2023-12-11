package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		int numeros[][] = new int[3][2];
		int contPares = 0, somaImpar = 0, linha, coluna;
		
		Scanner ler = new Scanner(System.in);
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.println("Digite o número da linha " + linha + ", na coluna " + coluna);
				numeros[linha][coluna] = ler.nextInt();
				
				if (numeros[linha][coluna] % 2 == 0) {
					contPares++;			
				} else {
					somaImpar += numeros[linha][coluna];
				}
			}
		}
		
		System.out.println("\nTotal de números pares: " + contPares);
		System.out.println("\nSomatório dos números ímpares: " + somaImpar);
	}

}
