package estruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		/*
		  	List é uma extensão da Interface Collection. Faz toda a 
		  	manipulação dos dados e funciona como um array (possui 
		  	indices), porém com um tamanho dinâmico (não precisamos 
		  	definir ele). 

 			Ela possui 4 implementações: ArrayList, Vector, LinkedList
 			e Stack.
 			
 			ArrayList e Vector são semelhantes e apenas se diferenciam 
 			na performance (ArrayList se sai melhor nisso).
 			
 			LinkedList ou Lista Vinculada é uma estrutura de dados linear, 
 			na qual os elementos não são armazenados de forma sequencial. 
 			Os elementos em uma lista vinculada são vinculados usando 
 			ponteiros internamente, que "apontam" para o endereço de 
 			Memória do próximo item (SimpleLinkedList - Lista Vinculada 
 			simples) ou para o endereço de Memória do próximo item e do 
 			item anterior (DoubleLinkedList - Lista Duplamente Vinculada).
 			
 			E por ultimo o Stack. Uma Pilha é uma estrutura de dados do 
 			tipo LIFO: "O último elemento inserido na pilha é o primeiro 
 			elemento que será retirado da pilha." (Last In - First Out).
		*/
		
		minhaLista.add(8); // add -> adiciona valores para o ArrayList
		minhaLista.add(6);
		minhaLista.add(3);
		minhaLista.add(2);
		
		System.out.println("\n\tMostrando os elementos da lista");
		for (Integer listaElementos : minhaLista) {		// For Each
			System.out.println(listaElementos);
		}
		
		System.out.println("\n\tRemovendo um elemento da lista");
		minhaLista.remove(0);
		for (Integer listaElementos : minhaLista) {		// For Each
			System.out.println(listaElementos);
		}
		
		
		// Pegando um elemento da lista
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento da lista é: " + primeiroElemento);
		
		for (int i = 0; i < minhaLista.size(); i++) {	// size() -> substitui o length
			System.out.println("\nElemento: " + minhaLista.get(i));
		}
		
		
		// Ordenando os elementos da lista
		Collections.sort(minhaLista);
		
		System.out.println("\n\tLista depois de ordenada: ");
		System.out.println("\n" + minhaLista);
		System.out.println(); 	// System.out.println vazio, limpa o cache
		
		
		/*	Métodos da Collections
		 	
		 	sort() 		Ordena a lista.
		 	max()		Retorna o maior elemento.
		 	min()		Retorna o menor elemento.
		*/
		
		/* 	Métodos da Collection List
		 	
		 	add(Objeto)			Adiciona um objeto no final da lista.
		 	
			add(Indice,Objeto)	Adiciona um objeto na posição indicada (empurra 
								elementos existentes para a frente)
			
			get(Indice)			Recupera um objeto pelo índice.
			
			indexOf(Objeto)		Procura um objeto e retorna índice da primeira ocorrência do objeto.
			
			set(Indice,Objeto)	Grava um objeto na posição indicada (apaga qualquer
								outro que ocupava a posição).
			
			remove(Indice)		Apaga o objeto armazenado na posição indicada pelo índice.
			
			clear()				Limpa a lista.
			
			size()				Retorna o tamanho da lista (numero de elementos armazenados).
			
			isEmpty()			Retorna true se a lista está vazia.
			
			contains(Objeto)	Retorna true se existe uma ocorrência do elemento na lista.
			
			sort(null)			Ordena os elementos da lista em ordem crescente.
			
			sort(Comparator.reverseOrder())	Ordena os elementos da lista em ordem decrescente.
		*/
		
	}

}
