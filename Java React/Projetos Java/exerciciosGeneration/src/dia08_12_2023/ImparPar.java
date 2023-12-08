package dia08_12_2023;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num, impar = 0, par = 0;
		
		System.out.println("\tQuantos são pares e quantos são ímpares");
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("\nDigite o " + contador + "° número:");
			num = ler.nextInt();
			
			if (num % 2 == 0) {
				par++;
				
			} else {
				impar++;
			}
		}
		
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);

	}

}
