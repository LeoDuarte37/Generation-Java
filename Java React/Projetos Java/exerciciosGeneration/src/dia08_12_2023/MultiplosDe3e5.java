package dia08_12_2023;

import java.util.Scanner;

public class MultiplosDe3e5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("\tMultiplos de 3 e 5");
		System.out.println("\nDigite dois números para criar um intervalo."
						 + "\nO primeiro deve ser menor que o segundo!!");
		
		System.out.println("\nPrimeiro número: "); 
		num1 = ler.nextInt();
		
		System.out.println("\nSegundo número: "); 
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.println("---------------------------------------");
			System.out.println("\nIntervalo inválido!");
			
		} else {
			System.out.println("\nNo intervalo entre " + num1 + " e " + num2 + ":");
			
			for (int contador = num1; num1 <= num2; num1++) {
				if (num1 % 3 == 0 && num1 % 5 == 0) {
					System.out.println(num1 + " é multiplo por 3 e 5");
				}
			}
			
		}
	}

}
