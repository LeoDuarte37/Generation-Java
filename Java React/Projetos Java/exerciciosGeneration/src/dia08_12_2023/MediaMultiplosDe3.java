package dia08_12_2023;

import java.util.Scanner;

public class MediaMultiplosDe3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, multiplo = 0;
		float media = 0f;
		
		do {
			System.out.println("\nDigite um número: ");
			num = ler.nextInt();
			
			if (num != 0 && num % 3 == 0) {
				media = media + num;
				multiplo++;
			}
			
		} while(num != 0);
		
		media = media / multiplo;
		
		System.out.println("\nA média dos números multiplos de 3 é: " + media);


	}

}
