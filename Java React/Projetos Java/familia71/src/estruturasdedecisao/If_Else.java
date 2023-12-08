package estruturasdedecisao;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextFloat();
		
		media = (n1 + n2 + n3) / 3;;
		
		if (media >= 7 && media <= 10) {
			System.out.println("\nAprovado!");
			
		} else if (media >= 5) {
			System.out.println("\nRecuperação...");
			
		} else {
			System.out.println("\nReprovado :(");
		}
	}

}
