package estruturasdedecisao;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("\n\tMenu de opções");
		System.out.println("\n1 - Cadastrar");
		System.out.println("\n2 - Transferência");
		System.out.println("\n3 - Ver saldo");
		
		System.out.println("\nDigite uma opção:");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Cadastro realizado!");
			break;
			
		case 2: 
			System.out.println("Transferência realizada!");
			break;
			
		case 3: 
			System.out.println("Seu saldo é: ");
			break;
			
		default:
			System.out.println("Opção inválida");
			
		}
	}

}
