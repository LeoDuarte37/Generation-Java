package options;

import java.util.Optional;

public class TesteOptional2 {

	public static void main(String[] args) {
	
		Colaborador c1 = new Colaborador(1L, "James Bond", 1000f);
		
		Optional <Colaborador> colaboradorOptional = Optional.of(c1);
		
		colaboradorOptional.map(resposta -> resposta.getNome())
							   .filter(colaboradorNome -> colaboradorNome.startsWith("J"))
							   .orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));
		
		System.out.println("\nNome do colaborador: " + colaboradorOptional.get().getNome());
		
		/*
			of()			Retorna um Optional com o valor fornecido, mas o valor não 
							pode ser nulo.
			
			map()			Percorre o array e se estiver um valor presente retorna um 
							optional com o valor, se não, um optional vazio.
						
			filter()		Se houver um valor e ele corresponder ao filtro, retornará 
							um optional com o valor, se não, um optional vazio.
		 
		 	orElseThrow() 	Lança uma excessão caso os resultados acima retorna false.
		 	
		 	startsWith()	Método da String para verificar a primeira letra.
		 	
		 	get() 			Acessa o objeto, nesse caso o c1.
		 	
		 	getNome()		Método Getter de c1.  
		*/
		
	}

}
