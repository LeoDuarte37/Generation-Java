package dia12_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEncontrarNumero {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
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
		
		System.out.println("\tDigite o número que deseja encontrar: ");
		int numero = ler.nextInt();
		
		if (numeros.contains(numero)) {
			System.out.println("\nNúmero " + numero + " foi encontrado na posição: " 
							   + numeros.indexOf(numero));
		} else {
			System.out.println("\nNúmero " + numero + " não foi encontrado!");
		}
	}

}
