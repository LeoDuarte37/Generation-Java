package dia13_12_2023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueFilaDoBanco {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\tMenu da fila do banco");
		
		do {
			System.out.println("\n--------------------------------");
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("\n2 - Listar todos os clientes");
			System.out.println("\n3 - Chamar cliente");
			System.out.println("\n4 - Sair");
			System.out.println("\n--------------------------------");
			
			System.out.println("Opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1: 
				ler.nextLine();
				
				System.out.println("\nDigite o nome do cliente que deseja adicionar: ");
				fila.add(ler.nextLine());
				System.out.println("\nCliente adicionado!");
				break;
				
			case 2: 
				System.out.println("\nFila de clientes: ");
				System.out.println("\n" + fila);
				break;
							
			case 3: 
				if (!(fila.isEmpty())) {
					System.out.println("\nCliente " + fila.poll() + " foi chamado!");
					System.out.println("\n" + fila);
				} else {
					System.out.println("\nA fila está vazia!");
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
