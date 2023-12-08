package estruturaderepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int contador;
		
		System.out.println("As vagas são limitadas! Inscreva-se já!");
		
		for (contador = 1; contador < 4; contador++) {
			System.out.println("\nVocê foi o " + contador + "°! Digite seu nome: ");
			nome = ler.nextLine();
			ler.close();
		}
		
		System.out.println("\nVagas esgotadas...");
		
	}

}
