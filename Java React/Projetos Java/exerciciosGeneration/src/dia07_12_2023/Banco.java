package dia07_12_2023;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float saldo = 1000f, valor;
		int opcao;
		
		System.out.println("\n\tMenu");
		System.out.println("\n1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("\nSaldo: " + saldo);
			break;
			
		case 2:
			System.out.println("\nDigite o valor de saque: ");
			valor = ler.nextFloat();
			
			saldo -= valor;
			
			System.out.println("\nNovo saldo: " + saldo);
			break;
			
		case 3:
			System.out.println("\nDigite o valor de depósito: ");
			valor = ler.nextFloat();
			
			saldo += valor;
			
			System.out.println("\nNovo saldo: " + saldo);
			break;
		}
	}

}
