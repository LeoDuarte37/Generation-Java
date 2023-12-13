package dia13_12_2023;

import java.util.Scanner;
import java.util.Stack;

public class StackLivros {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\tMenu da pilha de livros");
		
		do {
			System.out.println("\n--------------------------------");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("\n2 - Listar todos os livros");
			System.out.println("\n3 - Retirar livro");
			System.out.println("\n4 - Sair");
			System.out.println("\n--------------------------------");
			
			System.out.println("Opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1: 
				ler.nextLine();
				
				System.out.println("\nDigite o nome do livro que deseja adicionar: ");
				pilha.push(ler.nextLine());
				System.out.println("\nLivro adicionado!");
				break;
				
			case 2: 
				System.out.println("\nPilha de livros: ");
				System.out.println("\n" + pilha);
				break;
							
			case 3: 
				if (!(pilha.isEmpty())) {
					pilha.pop();
					System.out.println("\nUm Livro foi retirado da pilha!");
					System.out.println("\n" + pilha);
				} else {
					System.out.println("\nA pilha está vazia!");
				}
					
				break;
				
			case 4: 
				System.out.println("\nTchau :)");
				break;
				
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
			
		} while(op != 4);
		
		ler.close();

	}

}
