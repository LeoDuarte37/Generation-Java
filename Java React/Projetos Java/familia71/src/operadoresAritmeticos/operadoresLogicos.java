package operadoresAritmeticos;

public class operadoresLogicos {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean result;
		
		// Operadores relacionais
		
		result = x > y;
		System.out.println(x + " é maior que " + y + "? " + result);
		
		result = x == y;
		System.out.println(x + " é igual que " + y + "? " + result);
		
		result = x < y;
		System.out.println(x + " é menor que " + y + "? " + result);
		
		
		// Operadores lógicos
		
		// Or 	= 	||
		// And 	= 	&&
		// Not	=	!
		
		result = x < y || x > y;
		System.out.println("\n" + x + " é menor ou maior que " + y + "? " + result);
		
		result = x < y && x == 10;
		System.out.println(x + " é menor que " + y + " E igual a 10" + "? " + result);
		
		result = !(x > y);	
		System.out.println(x + " é maior que " + y + "? " + result);
		// Negação. 10 é maior que 5, porém esta negando.
	}

}
