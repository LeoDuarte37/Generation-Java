package estruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n------------------------------------------------");
			System.out.println("\nMenu do Estoque");
			System.out.println("\n1 - Adicionar produtos");
			System.out.println("\n2 - Mostrar produtos do estoque");
			System.out.println("\n3 - Atualizar produtos");
			System.out.println("\n4 - Remover produtos ");
			System.out.println("\n5 - Sair");
			System.out.println("\n------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do produto: ");
				String produto = ler.nextLine().toLowerCase();
				
				estoque.add(produto);
				break;
			
			case 2:
				System.out.println("\n\tOs produtos do estoque são: ");
				System.out.println("\t" + estoque);
				
				break;
				
			case 3: 
				ler.nextLine();
				System.out.println("\n\tDigite o produto que deseja atualizar: ");
				String verifica = ler.nextLine().toLowerCase();
				
				System.out.println("\n\tDigite o produto que entrará no lugar do " + verifica);
				String novo = ler.nextLine().toLowerCase();
				
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
					
				} else {
					System.out.println("\nProduto não existe no estoque!!");
				}
				
				System.out.println("\t" + estoque);
				break;
				
			case 4: 
				ler.nextLine();
				System.out.println("\nDigite o nome do produto que deseja remover: ");
				String produtoR = ler.nextLine().toLowerCase();
				
				if (estoque.contains(produtoR)) {
					estoque.remove(produtoR);
					
				} else {
					System.out.println("\nProduto não existe no estoque!!");
				}
				
				System.out.println("\t" + estoque);
				break;
				
			case 5: 
				System.out.println("\nTchau :)");
				break;
			
			default:
				System.out.println("Opção inválida!");
				
			}
			
		} while(op != 5);

	}
	
	// equalsIgnoreCase()

}
