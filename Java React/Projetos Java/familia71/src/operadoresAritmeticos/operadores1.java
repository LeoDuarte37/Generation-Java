package operadoresAritmeticos;

import java.util.Scanner;

public class operadores1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Operadores aritméticos
		
		int num1, num2, resul;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		resul = num1 + num2;
		
		// resul = num1 - num2; 	Subtração
		// resul = num1 * num2;		Multiplicação
		// resul = num1 / num2;		Divisão
		// resul = num1 % num2;		Resto da divisão
		
		System.out.println(num1 + " + " + num2 + " = " + resul);
		
		// Operadores de atribuição
		
		// resul += num1			Soma resul + num1
		// resul -= num1			Soma resul - num1
		// resul *= num1			Soma resul * num1
		// resul /= num1			Soma resul / num1
		// resul %= num1			Soma resul % num1
		
		ler.close();
	}

}
