package dia07_12_2023;

import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String tipo;
		int opcao;
		
		System.out.println("\n\tFiltro de Animais");
		
		System.out.println("\nDigite uma das duas opções");
		System.out.println("Vertebrado - Invertebrado");
		tipo = ler.nextLine().toLowerCase();
		
		if (tipo.equals("vertebrado")) {
			System.out.println("\nDigite uma das duas opções");
			System.out.println("Ave - Mamifero");
			tipo = ler.nextLine().toLowerCase();
			
			if (tipo.equals("ave")) {
				System.out.println("\nEscolha uma das duas opções");
				System.out.println("1 - Carnivero");
				System.out.println("2 - Onívoro");
				opcao = ler.nextInt();
				
				switch (opcao) {
				case 1: 
					System.out.println("Águia");
					break;
					
				case 2: 
					System.out.println("Pomba");
					break;
				}
				
			} else if (tipo.equals("mamifero")){
				System.out.println("\nEscolha uma das duas opções");
				System.out.println("\n1 - Onívoro");
				System.out.println("\n2 - Herbívoro");
				opcao = ler.nextInt();
				
				switch (opcao) {
				case 1: 
					System.out.println("\nHomem");
					break;
					
				case 2: 
					System.out.println("\nVaca");
					break;
				}
			}
			
			
		} else if (tipo.equals("invertebrado")) {
			System.out.println("\nDigite uma das duas opções");
			System.out.println("Inseto - Anedileo");
			tipo = ler.nextLine().toLowerCase();
			
			if (tipo.equals("inseto")) {
				System.out.println("\nEscolha uma das duas opções");
				System.out.println("\n1 - Hematógafo");
				System.out.println("\n2 - Herbívoro");
				opcao = ler.nextInt();
				
				switch (opcao) {
				case 1: 
					System.out.println("\nPulga");
					break;
					
				case 2: 
					System.out.println("\nLagarta");
					break;
				}
				
			} else if (tipo.equals("anedileo")){
				System.out.println("\nEscolha uma das duas opções");
				System.out.println("\n1 - Hematófogo");
				System.out.println("\n2 - Onívoro");
				opcao = ler.nextInt();
				
				switch (opcao) {
				case 1: 
					System.out.println("\nSanguessuga");
					break;
					
				case 2: 
					System.out.println("\nMinhoca");
					break;
				}
			}
		}
		
		
		

		
		
		
	}

}
