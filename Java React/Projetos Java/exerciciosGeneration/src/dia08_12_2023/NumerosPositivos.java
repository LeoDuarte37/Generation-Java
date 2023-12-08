package dia08_12_2023;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("\nDigite um número: ");
			num = ler.nextInt();
			
			if (num > 0) {
				soma += num;
			}
			
		} while(num != 0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);

	}

}
