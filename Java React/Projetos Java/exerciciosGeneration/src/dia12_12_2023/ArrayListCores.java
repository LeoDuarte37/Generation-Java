package dia12_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListCores {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\tAdicione 5 cores para a lista");
		
		do {
			System.out.println("\nDigite um cor: ");
			String cor = ler.nextLine();
			cores.add(cor);
		} while(cores.size() < 5);
		
		System.out.println("\nVocê adicionou as seguintes cores: ");
		System.out.println("\n\t" + cores);
		
		cores.sort(null);
		
		System.out.println("\nLista de cores em ordem crescente: ");
		System.out.println("\n\t" + cores);
		
	}

}
 