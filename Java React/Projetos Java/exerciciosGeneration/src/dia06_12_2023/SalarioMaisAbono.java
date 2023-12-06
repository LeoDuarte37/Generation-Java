package dia06_12_2023;

import java.util.Scanner;

public class SalarioMaisAbono {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Salário + abono: " + novoSalario);
		
		ler.close();
	}

}
