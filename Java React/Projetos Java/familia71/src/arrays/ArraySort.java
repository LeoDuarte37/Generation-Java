package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		/*
			Arrays.sort(array)	
		  
			Ordena os elementos de um array de primitivos em ordem crescente.
		
		*/
		
		String array_nomes[] = {"Samantha", "Amanda", "Vinicius", "Cauê", "Leonardo"};

        Arrays.sort(array_nomes);
        
        System.out.println("Array em Ordem Crescente \n");
        for(int indice = 0; indice < array_nomes.length; indice++) {
            System.out.println(array_nomes[indice]);    
        }
        
        Arrays.sort(array_nomes, Collections.reverseOrder());
        
        System.out.println("\nArray em Ordem Decrescente \n");
        for(int indice = 0; indice < array_nomes.length; indice++) {
            System.out.println(array_nomes[indice]);    
        }
        
        
        
        // ----------------------------------------------------------------
        
        
        System.out.println("\n-------------------------");
        
        
        int vetorInteiros[] = { 3, 2, 1, 6, 5, 10, 7, 4, 9, 8 };

		Arrays.sort(vetorInteiros);

		System.out.println("\nArray de primitivos em Ordem Crescente \n");
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(vetorInteiros[indice]);
		}

		System.out.println("\nArray de primitivos em Ordem Decrescente \n");
		
		int[] reverseArray = new int[vetorInteiros.length];

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			reverseArray[indice] = vetorInteiros[(vetorInteiros.length - 1) - indice];
		}

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(reverseArray[indice]);
		}
	}

}
