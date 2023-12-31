package stream_metodosIntermediarios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("\nExemplo - Método Filter");

		List<Integer> numerosPares = numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println("\nExibir apenas os Numeros Pares: " + numerosPares);

	}

}
