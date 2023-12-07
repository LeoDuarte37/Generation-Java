package dia07_12_2023;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraVez;
		
		System.out.println("\nDigite seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("\nÉ a sua primeira doação? True (sim) / False (não)");
		primeiraVez = ler.nextBoolean();

		if (idade >= 18 && idade < 60) {
			System.out.println("\n" + nome + " está apto(a) a doar sangue!");
			
		} else if(idade >= 60 && idade <= 69 && primeiraVez == false) {
			System.out.println("\n" + nome + " está apto(a) a doar sangue!");
			
		} else {
			System.out.println("\n" + nome + " não está apto(a) a doar sangue!");
		}
	}

}
