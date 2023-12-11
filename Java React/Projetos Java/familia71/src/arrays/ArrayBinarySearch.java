package arrays;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		/*
		 	Arrays.binarySearch(array, chave de pesquisa)	
		 
			Retorna a posição do elemento procurado no array. 
			O array deverá estar ordenado e sem valores duplicados.
		*/
		
		int vetorInteiros[] = {1,2,3,4,5,10,7,6,9,8};
		
		
		Arrays.sort(vetorInteiros); 	// Ordena o Vetor 
		
		System.out.println("\nVetor Ordenado");
		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			 System.out.println(vetorInteiros[indice]);
		}

        System.out.println("\nO elemento 10 Existe? Qual é a posição?");

        int posicao = Arrays.binarySearch(vetorInteiros, 10);	// Trás o indice do valor encontrado
        
        // Se a posição for positiva == encontrou
        if (posicao >= 0 )
			System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);
		else
			System.out.println("\nElemento não encontrado!");


	}

}
