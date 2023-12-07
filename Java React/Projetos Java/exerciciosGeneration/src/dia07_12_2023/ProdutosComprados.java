package dia07_12_2023;

import java.util.Scanner;

public class ProdutosComprados {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int codigo, quantidade;
		float valorTotal;
		
		System.out.println("Digite o código do produto comprado: ");
		codigo = ler.nextInt();
		
		System.out.println("Digite a quantidade do produto comprado: ");
		quantidade = ler.nextInt();
		
		switch (codigo) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.println("\nProduto: Cachorro Quente");
			System.out.println("Valor total: " + valorTotal);
			break;

		case 2:
			valorTotal = quantidade * 15;
			System.out.println("\nProduto: X-Salada");
			System.out.println("Valor total: " + valorTotal);
			break;
			
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("\nProduto: X-Bacon");
			System.out.println("Valor total: " + valorTotal);
			break;

		case 4:
			valorTotal = quantidade * 12;
			System.out.println("\nProduto: Bauru");
			System.out.println("Valor total: " + valorTotal);
			break;

		case 5:
			valorTotal = quantidade * 8;
			System.out.println("\nProduto: Refrigerante");
			System.out.println("Valor total: " + valorTotal);
			break;
			
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("\nProduto: Suco de laranja");
			System.out.println("Valor total: " + valorTotal);
			break;
		}
	}

}
