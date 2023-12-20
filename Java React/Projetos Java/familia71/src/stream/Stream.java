package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List <Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println(lista);
		
		// Somar somente os números pares
		
		int resultado = 0;
		
		for (Integer x : lista) {
			if (x % 2 == 0) {
				resultado += x;
			}
		}
		
		System.out.println("\nFor: " + resultado);

		System.out.println("\nStream: " + lista.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum());
		
		
		// Verificar convidados com a letra inicial 'M'
		
		List <String> listaConvidados = Arrays.asList("Marcos", "Marcela", "Jaime", "Bruna", "Fernando", "Fred");
		
		System.out.println("\n" + listaConvidados);
		
		for (String x : listaConvidados) {
			char letra = x.toLowerCase().charAt(0);
			
			if (letra == 'm') {
				System.out.println("\nFor: " + x);
			}
		}
		
		System.out.println("\nStream: " + listaConvidados.stream()
			.filter(x -> x.toLowerCase().startsWith("m"))
			.collect(Collectors.toList()));
		
		
		
	}

}
