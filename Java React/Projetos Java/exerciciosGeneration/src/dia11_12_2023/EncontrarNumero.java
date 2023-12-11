package dia11_12_2023;

import java.util.Scanner;

public class EncontrarNumero {

	public static void main(String[] args) {
		
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 1, 0, 6};
		int valor, indice = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja encontrar:");
		valor = ler.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if (valor == numeros[i]) {
				indice = i;
			} 
		}
		
		if (numeros[indice] == valor) {
			System.out.println("\nO número " + valor + " está localizado na posição: " + indice);			
		} else {
			System.out.println("\nO número " + valor + " não foi encontrado!");			
		}
		
		
	}

}
