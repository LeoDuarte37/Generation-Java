package primeiraaula;

import java.util.Scanner;

public class olaMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = "Carol Ferreira";
		int idade = 18;
		float altura = 1.70f;
		final float dinheiro = 0f; 	// final = constante 
		
		// ---------------------------------------------
	
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Meu nome é: " + nome);
		System.out.println("Tenho " + idade + " anos");
		
		
		entrada.close();
	}  

}
