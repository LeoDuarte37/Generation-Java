package exceptions;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		boolean loop = true;

		int idade = 1;
		boolean lop = true;

		do {

			try {

				System.out.println("\nDigite uma idade: ");
				idade = ler.nextInt();

				validarIdade(idade);

			} catch (ArithmeticException e) {

				System.err.println(e);
				System.out.println("\nDigite um número inteiro maior ou igual a 18!");
			}

		} while (idade != 0);
	}

	public static void validarIdade(int idade) {

		if (idade > 0 && idade < 18) {
			throw new ArithmeticException("A Pessoa não pode dirigir!!");
		
		} else if (idade == 0) {
			System.out.println("Volte sempre!");
		
		} else {
			System.out.println("A Pessoa pode dirigir!!");
		}
	}
}
