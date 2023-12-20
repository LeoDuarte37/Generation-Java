package stream_metodosTerminais;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("\nExemplo - Método Count");

		long numeroEstadosTerminaComO = estados.stream().filter(x -> x.toString().endsWith("o")).count();

		System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numeroEstadosTerminaComO);

	}

}
