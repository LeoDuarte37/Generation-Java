package dia07_12_2023;

import java.util.Scanner;

public class SalarioColaborador {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario, novoSalario;
		
		System.out.println("\n\tReajuste do Salário");
		
		System.out.println("\nDigite o nome do colaborador: ");
		nome = ler.nextLine();
		
		System.out.println("\nDigite o código do cargo de " + nome);
		codigo = ler.nextInt();
		
		System.out.println("\nDigite o salário de " + nome);
		salario = ler.nextFloat();
		
		switch (codigo) {
		case 1:
			novoSalario = salario + (salario * (10f / 100f));
			System.out.println("\nColaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: " + novoSalario);
			break;

		case 2:
			novoSalario = salario + (salario * (7f / 100f));
			System.out.println("\nColaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 3:
			novoSalario = salario + (salario * (9f / 100f));
			System.out.println("\nColaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: " + novoSalario);
			break;

		case 4:
			novoSalario = salario + (salario * (6f / 100f));
			System.out.println("\nColaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: " + novoSalario);
			break;

		case 5:
			novoSalario = salario + (salario * (5f / 100f));
			System.out.println("\nColaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 6:
			novoSalario = salario + (salario * (8f / 100f));
			System.out.println("\nColaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: " + novoSalario);
			break;
		}
	}

}
