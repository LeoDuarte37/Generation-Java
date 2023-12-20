package options;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		
		String palavras[] = new String[3];

		Optional <String> checaNulo = Optional.ofNullable(palavras[1]);
		
		if (checaNulo.isPresent()) { 	// isPresent retorna true ou false para saber se é nulo ou não
			String palavra = palavras[1].toLowerCase();
			System.out.print(palavra);
		} else {
			System.out.println("A palavra é nula!");			
		}
		
		Optional <String> optionalVazio = Optional.empty();
		System.out.println("\n Exibir optionalVazio: " + optionalVazio);
		System.out.println("\n optionalVazio está vazio? " + optionalVazio.isEmpty());
		
		Optional<String> valor_indice_02 = Optional.of(palavras[2]);
		System.out.println("\n Exibir valor_indice_02: " + valor_indice_02);
		System.out.println("\n Obter o conteúdo de valor_indice_02: " + valor_indice_02.get());
		System.out.println("\n valor_indice_02 está presente? " + valor_indice_02.isPresent());
		
		/*
		 	empty()			 Retorna uma instância do Optional vazia.
		
			isEmpty()		 Checa se um valor não está presente. Se não estiver presente 
							 retorna true, se não, retorna false.
							 
			of()			 Retorna um Optional com o valor fornecido, mas o valor não 
						 	 pode ser nulo.
		
		    ofNullable 		 retorna um Optional com o valor se estiver presente, caso 
		    		 	 	 contrário, retorna um Optional vazio.
		    		 	 	 
		    isPresent()		 Se um valor estiver presente, executa uma ação no valor, 
		    				 caso contrário, não faz nada.
		*/
	}

}
