package dia12_12_2023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySetEncontrarNumero {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner ler = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que deseja encontrar: ");
		int numero = ler.nextInt();
		
		if (numeros.contains(numero)) {
			System.out.println("\nO número " + numero + " foi encontrado!");
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}

}
