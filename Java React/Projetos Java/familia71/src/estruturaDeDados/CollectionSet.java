package estruturaDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> meuSet = new HashSet<Integer>();	
		
		/*
		   	Set é uma extensão de Collection, e modela a definição matemática de 
		   	um conjunto de dados. É uma coleção de objetos que NÂO aceita objetos 
		   	duplicados. Permite no máximo um único elemento nulo.
		   	
		   	Possui 3 implementações: HashSet, TreeSet, e LinkedHashSet. 
		   	
		   	HashSet é a mais rápida de todas, porque ela utiliza internamente uma 
		   	HashTable e seus elementos não são ordenados. É indicada se você precisa 
		   	apenas garantir a alta performance sem se importar com a ordem com que 
		   	os elementos estão ordenados.
		   	
		   	----------------------------------------------------------------------
		   	
		   	TreeSet implementa um algoritmo conhecido como árvore. Sua principal 
		   	característica é que ele é o único Set que implementa a interface 
		   	SortedSet, logo mantém os elementos da Collection ordenados 
		   	automaticamente, independente da ordem que você inserir os elementos.
		   	Isso tem um custo de performance comparado ao HashSet.
		   	
		   	----------------------------------------------------------------------
		   	
		   	LinkedHashSet é o meio termo entre HashSet e TreeSet. Ela nos proporciona 
		   	um pouco da performance do HashSet e um pouco da ordenação do TreeSet. Os 
		   	elementos são mantidos na ordem em que são inseridos na Collection. A 
		   	LinkedHashSet implementa a Interface NavigableSet, que oferece uma série 
		   	de Métodos para percorrer e iterar sobre a Collection tanto na ordem 
		   	crescente, quanto na ordem decrescente. 
		*/
		
		/*	Métodos da Collection Set
		  
		  	add(Objeto)			Adiciona um Objeto na Collection Set.
		 	remove(Objeto)		Apaga o Objeto armazenado na Collection Set.
		 	clear()				Limpa a Collection Set
		 	size()				Retorna o tamanho da Collection Set (numero de elementos armazenados).
			isEmpty()			Retorna true se a Collection Set está vazia.
			contains(Objeto)	Retorna true se o Objeto existe na Collection Set.
			hashcode()			Retorna o Hashcode do elemento (tipo um id do elemento).
			
			Ela consegue gerar um hashcode para cada elemento, trabalhando
		   	com exclusividade de itens no HashMap.
		*/
		
		meuSet.add(8); // add -> adiciona valores para o ArrayList
		meuSet.add(6);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(3);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();	// Iterator Ordena e tira a duplicidade
		
		/*
			 A Interface Iterable é a raiz de toda a hierarquia das coleções, ou  
			 seja, toda classe e interface a implementa. A função principal é 
			 percorrer todos os objetos de qualquer uma da Collections, presentes
			 no Pacote Collections, como sequências simples de itens de dados.

			 Usar sempre que quiser enumerar elementos em todas as Interfaces 
			 implementadas pelas Collections: Set, List, Queue, Deque, e todas 
			 as classes implementadas da interface Map. 
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
