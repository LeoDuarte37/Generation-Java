package estruturaDeRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String opcao = "sim";
		float resultado, num;
		
		System.out.println("\tCalculadora que só multiplica por 5");
		
		while (opcao.equals("sim")) {
			System.out.println("\nDigite um valor: ");
			num = ler.nextFloat();
			
			resultado = num * 5;
			System.out.println(num + " x 5 = " + resultado);
			
			System.out.println("\nDeseja continuar? Sim/Não");
			opcao = ler.next().toLowerCase();
		}
	}

}
