package dia06_12_2023;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		n2 = ler.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = ler.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		n4 = ler.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença entre o produto de n1 e n2, entre o produto de n3 e n4 "
		+ diferenca);
	}

}
