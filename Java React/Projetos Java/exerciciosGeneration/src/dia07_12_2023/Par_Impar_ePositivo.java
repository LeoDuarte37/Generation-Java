package dia07_12_2023;

import java.util.Scanner;

public class Par_Impar_ePositivo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int num;
		
		System.out.println("Digite um valor: ");
		num = ler.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println(num + " = numero par e positivo");
				
			} else {
				System.out.println(num + " = numero ímpar e positivo");
			}
			
		} else {
			if (num % -2 == 0) {
				System.out.println(num + " = numero par e negativo");
				
			} else {
				System.out.println(num + " = numero ímpar e negativo");
			}
		}
	}

}
