package dia06_12_2023;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horaExtra, desconto, salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = ler.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horaExtra = ler.nextFloat();
		
		System.out.println("Digite os descontos: ");
		desconto = ler.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - desconto;
		
		System.out.println("Salário líquido do colaborador: " + salarioLiquido);

	}

}
