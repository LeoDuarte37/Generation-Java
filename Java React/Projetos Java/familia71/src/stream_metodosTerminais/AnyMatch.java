package stream_metodosTerminais;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("\nExemplo - Método AnyMatch");

		boolean algumEstadoContemRio = estados.stream().anyMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nPelo menos um Estado contém a palavra Rio? " + algumEstadoContemRio);

	}

}
