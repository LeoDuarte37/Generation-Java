package arrays;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		
		/*
			Arrays.equals(array1, array 2)	
		 
			Compara 2 arrays retornando true se ambos tiverem o 
			mesmo conteúdo, as mesmas referências, na mesma ordem 
			e do mesmo tipo.
		*/
		
		String grupoA[] = { "Amanda", "Elen", "Vinicius" };
        String grupoB[] = { "Samantha", "Letícia", "Alan" };

        System.out.println("Os Arrays são iguais? ");

        if (Arrays.equals(grupoA, grupoB)) {
            System.out.println("Sim, são iguais.");
        } else {
            System.out.println("Não, são diferentes.");
        }

	}

}
