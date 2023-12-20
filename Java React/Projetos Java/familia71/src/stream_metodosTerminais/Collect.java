package stream_metodosTerminais;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", 
				"Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");

		List <String> estadosR = estados.stream()
		        .filter(x-> x.toString().startsWith("R"))
		        .sorted()
		        .collect(Collectors.toList());

		System.out.println("\nEstados cujo nome começam com a letra R: " + estadosR);
	}

}
