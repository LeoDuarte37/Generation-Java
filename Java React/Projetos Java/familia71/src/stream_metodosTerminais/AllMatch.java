package stream_metodosTerminais;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("\nExemplo - Método AllMatch");

		boolean todosEstadosContemRio = estados.stream().allMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nTodos os Estados contém a palavra Rio? " + todosEstadosContemRio);

	}

}
