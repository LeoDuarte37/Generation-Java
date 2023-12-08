package dia08_12_2023;

import java.util.Scanner;

public class PesquisaFuncionarios {

	public static void main(String[] args) {
		
		int idade, genero, funcao, devsBack = 0, mulheresCisTransFront = 0, 
		homensCisTransMobile40 = 0, naoBinariosFullMenor30 = 0, totalPesquisa = 0;
		
		float mediaIdade = 0f;
		
		char sair = 's';
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\tPesquisa interna");
		
		System.out.println("\n----------------");
		
		System.out.println("\nIdentidade de Gênero (número inteiro):");
		System.out.println("1 – Mulher Cis");
		System.out.println("2 – Homem Cis");
		System.out.println("3 – Não Binário");
		System.out.println("4 – Mulher Trans");
		System.out.println("5 – Homem Trans");
		System.out.println("6 - Outros");

		System.out.println("\nPessoa Desenvolvedora (número inteiro):");
		System.out.println("1 – Backend");
		System.out.println("2 – Frontend");
		System.out.println("3 – Mobile");
		System.out.println("4 – FullStack");
		
		System.out.println("\n----------------");
		
		while (sair == 's') {
			System.out.println("\nDigite sua idade (número inteiro):");
			idade = ler.nextInt();
			
			mediaIdade += idade;
			
			System.out.println("\nIdentidade de Gênero:");
			genero = ler.nextInt();
			
			System.out.println("\nPessoa Desenvolvedora:");
			funcao = ler.nextInt();
			
			if (funcao == 1) {
				devsBack++;
				
			} else if ((genero == 1 || genero == 4) && funcao == 2) {
				mulheresCisTransFront++;
				
			} else if ((genero == 2 || genero == 5) && funcao == 3 && idade > 40) {
				homensCisTransMobile40++;
				
			} else if(genero == 3 && funcao == 4 && idade < 30) {
				naoBinariosFullMenor30++;
			}
			
			totalPesquisa++;
			
			System.out.println("\nDeseja continuar (S/N):");
			sair = ler.next().toLowerCase().charAt(0);
		}
		
		mediaIdade = mediaIdade / totalPesquisa;
		
		System.out.println("\n----------------");
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + devsBack);
		
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " 
						  + mulheresCisTransFront);
		
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores "
						  + "de 40 anos: " + homensCisTransMobile40);
		
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack "
						  + "menores de 30 anos: " + naoBinariosFullMenor30);
		
		System.out.println("\nO número total de pessoas que responderam à pesquisa: " 
						  + totalPesquisa);
		
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa: " 
						  + mediaIdade);
		
	}

}
