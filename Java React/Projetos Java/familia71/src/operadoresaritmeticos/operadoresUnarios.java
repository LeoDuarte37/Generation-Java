package operadoresaritmeticos;

public class operadoresUnarios {

	public static void main(String[] args) {
		int x = 10;
		int soma;
		
		System.out.println("Transformando um número em negativo: " + (-x));
		
		System.out.println("Pré incrementar: " + (soma = ++x));
		// Incrementa no X e depois atribui
		
		System.out.println("Pós incrementar: " + (soma = x++));
		// Primeiro atribui e depois incrementa no Y
		
		System.out.println("X: " + x);
		System.out.println("Soma: " + soma);

	}

}
