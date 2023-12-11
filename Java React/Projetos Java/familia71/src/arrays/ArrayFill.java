package arrays;

import java.util.Arrays;

public class ArrayFill {

	public static void main(String[] args) {
		
		/*
		 	Arrays.fill(array, valor)	
		 
		 	Preenche todo o array com o valor informado.
		*/
		
		int idade[] = new int[3];
		
		Arrays.fill(idade, 18);
		
		System.out.println(idade[0]);
		System.out.println(idade[1]);
		System.out.println(idade[2]);

	}

}
