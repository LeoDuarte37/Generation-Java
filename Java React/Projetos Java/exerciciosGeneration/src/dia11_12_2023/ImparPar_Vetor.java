package dia11_12_2023;

import java.util.Scanner;

public class ImparPar_Vetor {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		int soma = 0; 
		float media;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("\tPreencha os 10 indices do vetor");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("\nDigite o valor do indice " + i);
			numeros[i] = ler.nextInt();
			
			soma += numeros[i];		
		}
		
		System.out.println("Elementos nos índices ímpares:");	
		for (int i = 0; i < numeros.length; i++) {
			i++;
			System.out.println(numeros[i]);		
		}
		
		System.out.println("Elementos pares:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);		
			}
		}
		
		media = soma / 10f;
		
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia: " + media);
		
	}

}
