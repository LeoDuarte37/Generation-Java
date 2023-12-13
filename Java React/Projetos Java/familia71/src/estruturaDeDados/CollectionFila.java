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
		
		/*	Métodos do Queue
		  
		 	add(elemento)			Este método é usado para adicionar um elemento no final da fila.
		 	
			size()					Este método é usado para retornar o tamanho da fila.
			
			clear()					Este método é usado para remover todos os elementos da fila.
			
			remove(elemento)		Este método é usado para remover e retornar o primeiro elemento da fila.
			
			isEmpty()				Este método é usado para verificar se a fila está vazia ou não. 
									Retorna verdadeiro se a fila estiver vazia, caso contrário, falso.
			
			contains(elemento)		Este método é usado para verificar se a fila contém o elemento 
									fornecido ou não. Retorna verdadeiro se a fila contiver o elemento.
			
			peek()					Este método é usado para exibir, mas não remover, o elemento que está 
									sendo apontado pelo ponteiro HEAD desta fila (o primeiro elemento), 
									ou retornar nulo se esta fila estiver vazia.
			
			poll()					Este método é usado para exibir e remover, o elemento que está sendo 
									apontado pelo ponteiro HEAD desta fila (o primeiro elemento), ou 
									retornar nulo se esta fila estiver vazia.
		*/
	}

}
