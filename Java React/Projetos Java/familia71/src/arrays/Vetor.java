package arrays;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		float media[] = new float[4];					// Declaração sem dados
		// float media[] = {1.6f, 5.7f, 10f, 8.5f};		// Declaração com dados
		
		float n1, n2, n3, mediaGeral, somaMedia = 0;
		int x; 
		
		Scanner ler = new Scanner(System.in);
		
		for (x = 0; x < 4; x++) {
			System.out.println("\nDigite a primeira nota: ");
			n1 = ler.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			n2 = ler.nextFloat();
			
			System.out.println("Digite a terceira nota: ");
			n3 = ler.nextFloat();
			
			media[x] = (n1 + n2 + n3) / 3;
			
			somaMedia += media[x];
		}
		
		mediaGeral = somaMedia / x;
		
		System.out.println("\nMédia geral foi de: " + mediaGeral);
		
		for (x = 0; x < 4; x++) {
			System.out.println("\nMédia do aluno(a) " + (x+1) + "° foi de: " + media[x]);
		}

	}

}
