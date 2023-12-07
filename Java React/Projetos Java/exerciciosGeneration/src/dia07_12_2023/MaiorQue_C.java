package dia07_12_2023;

import java.util.Scanner;

public class MaiorQue_C {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println(a + " + " + b + " = " + soma + " > " + c);
			System.out.println("A soma de A e B, é maior que C");
			
		} else if (soma < c) {
			System.out.println(a + " + " + b + " = " + soma + " < " + c);
			System.out.println("A soma de A e B, é menor que C");
			
		} else {
			System.out.println(a + " + " + b + " = " + soma + " == " + c);
			System.out.println("A soma de A e B, é igual a C");
		}
		
		
	}

}
