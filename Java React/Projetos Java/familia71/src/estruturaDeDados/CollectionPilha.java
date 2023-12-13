package estruturaDeDados;

import java.util.Stack;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato verde");
		pilha.push("Prato vermelho");
		pilha.push("Prato amarelo");
		pilha.push("Prato branco");
		
		System.out.println("\nElementos da pilha: " + pilha);
		
		System.out.println("\nRetirar elemento: " + pilha.pop());
		
		System.out.println("\nElementos da pilha: " + pilha);
		
		/*	Pilha (Stack)

			Fim
		
			elemento3
			elemento2
			elemento1
			
			Inicio
		
			Ele funciona como Last-in, First-out, ou seja, 
			o ultimo a entrar é o primeiro a sair, funcionando
			como uma pilha.
		*/
		
		/*	Alguns comandos do Stack
		 
		 	push() 		Adiciona um item a pilha
		 	pop()		Remove o ultimo item da pilha
		 	size()		Retorna o tamanho da pilha (length)
		 	clear()		Limpa toda a pilha
		*/
	}

}
