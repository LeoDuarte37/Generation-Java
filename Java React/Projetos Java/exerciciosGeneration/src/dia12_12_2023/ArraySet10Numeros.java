package dia12_12_2023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ArraySet10Numeros {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		int i = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\tAdicione 10 números (não repetidos) à lista de números: ");
		
		do {
			System.out.println("\nDigite o " + (i+1) + "° número: ");
			int numero = ler.nextInt();
			numeros.add(numero);
			
			i++;
		} while(i < 10);
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("\n\t(Iterator) Os números digitados foram: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		ler.close();
	}

}
