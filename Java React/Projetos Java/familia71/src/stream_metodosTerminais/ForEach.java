package stream_metodosTerminais;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("\nExemplo - Método ForEach");

		System.out.println("\nEstados cujo nome iniciam com a letra S:");

		estados.stream().filter(x -> x.toString().startsWith("S")).forEach(System.out::println);

	}

}
