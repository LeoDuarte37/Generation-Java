package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {

	public static void main(String[] args) {
		
		Queue<String> agenda = new LinkedList<String>();
		
		/*	Fila (Queue)
		
					   Inicio					Fim
			
					   elemento1, elemento2, elemento3	-  Entrada
			
			Saída   -  elemento2, elemento3...
		
			Ele funciona como First-in, First-out, ou seja, 
			o primeiro a entrar é o primeiro a sair, funcionando
			como uma fila de atendimento.
			
			O Queue é uma extensão de Collections, e possui 2 
			implementações: PriorityQueue e ArrayDeque.
			
			PriorityQueue e ArrayDeque não seguem esse principio, 
			já que permitem tanto a inserção e remoção de elementos, 
			no inicio e no fim da fila.
			
			Queue(fila) e Deque são interfaces, então não possuem 
			uma definição de métodos, precisando ser implementadas 
			em uma classe.
		*/
		
		Scanner ler = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\n------------------------------------------------");
			System.out.println("\nMenu do Agendamento");
			System.out.println("\n1 - Adicionar agendamento");
			System.out.println("\n2 - Mostrar agenda");
			System.out.println("\n3 - Pesquisar agendamento");
			System.out.println("\n4 - Agendamento concluído");
			System.out.println("\n5 - Sair");
			System.out.println("\n------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1: 
				ler.nextLine();
				System.out.println("\nDigite o nome que deseja adicionar: ");
				agenda.add(ler.nextLine());
				break;
				
			case 2:
				System.out.println("\nNomes agendados: ");
				System.out.println(agenda);
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o nome que deseja pesquisar: ");
				String nome = ler.nextLine();
				
				if (agenda.contains(nome)) {
					System.out.println("\nEsse nome está na agenda.");
				} else {
					System.out.println("\nEsse nome não está na agenda!");
				}
				
				break;
				
			case 4: 
				ler.nextLine();
				System.out.println("\nNome: " + agenda.remove() + ". Agendamento concluído!");
				
				/*
				 	O fila retira o primeiro que entrou, e pensando na 
				 	possibilidade do sistema ter um atendimento urgente, 
				 	podemos criar um teste para isso e passar o nome 
				 	dentro de aspas no remove. 
				*/
				
				break;
				
			case 5:
				System.out.println("\nTchau :)");
				break;
				
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
			
		} while(op != 5);
		
		ler.close();
	}

}
