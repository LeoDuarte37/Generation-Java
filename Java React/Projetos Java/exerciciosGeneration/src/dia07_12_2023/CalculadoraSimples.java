package dia07_12_2023;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		float num1, num2, calculo;
		
		System.out.println("\nDigite o primeiro valor: ");
		num1 = ler.nextFloat();

		System.out.println("\nDigite o segundo valor: ");
		num2 = ler.nextFloat();
		
		System.out.println("------------------------");
		
		System.out.println("\n\tEscolha a operação: ");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			calculo = num1 + num2;
			System.out.println("\nResultado: " + calculo);
			break;

		case 2:
			calculo = num1 - num2;
			System.out.println("\nResultado: " + calculo);
			break;

		case 3:
			calculo = num1 * num2;
			System.out.println("\nResultado: " + calculo);
			break;

		case 4:
			calculo = num1 / num2;
			System.out.println("\nResultado: " + calculo);
			break;
		}
		
		
		
	}

}
