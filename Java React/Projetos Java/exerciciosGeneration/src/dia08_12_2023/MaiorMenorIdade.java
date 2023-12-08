package dia08_12_2023;

import java.util.Scanner;

public class MaiorMenorIdade {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade = 0, maiores50 = 0, menores21 = 0;
		
		System.out.println("\tMenores que 21 e Maiores que 50");
		
		while (!(idade < 0)) {
			System.out.println("Digite uma idade:");
			idade = ler.nextInt();
			
			if (idade < 21 && idade > 0) {
				menores21++;
				
			} else if (idade > 50) {
				maiores50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
	}

}
