package estruturaDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> meuSet = new HashSet<Integer>();	
		
		meuSet.add(8); // add -> adiciona valores para o ArrayList
		meuSet.add(6);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(3);
		
		/*	Métodos da Collection Set
		  
		  	add(Objeto)			Adiciona um Objeto na Collection Set.
		 	remove(Objeto)		Apaga o Objeto armazenado na Collection Set.
		 	clear()				Limpa a Collection Set
		 	size()				Retorna o tamanho da Collection Set (numero de elementos armazenados).
			isEmpty()			Retorna true se a Collection Set está vazia.
			contains(Objeto)	Retorna true se o Objeto existe na Collection Set.
			hashcode()			Retorna o Hashcode do elemento (tipo um id do elemento).
		 */
		
		Iterator<Integer> iMeuSet = meuSet.iterator();	// Iterator Ordena e tira a duplicidade
		
		/*
			 A Interface Iterable é a raiz de toda a hierarquia de coleção, o que 
			 significa que cada classe e interface a implementa. A função principal 
			 de um iterador é permitir que o usuário percorra todos os objetos de 
			 qualquer uma da Collections, presentes no Pacote Collections, como se 
			 fossem sequências simples de itens de dados.

			 O Iterator deve ser usado sempre que quisermos enumerar elementos em 
			 todas as Interfaces implementadas pelas Collections: Set, List, Queue, 
			 Deque, e todas as classes implementadas da interface Map. 
		*/
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());	
		}
		
		/*
		  	hasNext()	Retorna verdadeiro se a iteração tiver mais elementos.
		  
		  	next()	Retorna o próximo elemento na iteração. Ele lança a Exceção 
		  	NoSuchElementException se nenhum outro elemento estiver presente.
		*/
	}

}
