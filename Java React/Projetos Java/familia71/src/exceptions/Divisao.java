package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dividendo, divisor, resultado;
		
		try {
			System.out.println("Digite o dividendo: ");
			dividendo = ler.nextInt();
			
			System.out.println("Digite o divisor: ");
			divisor = ler.nextInt();
			
			resultado = dividendo / divisor;
			
			System.out.println("Divisão: " + resultado);
			
		} catch (InputMismatchException e) {
			System.err.println("Exception: " + e);
			System.out.println("\nDigite números inteiros positivos!");
			
		} catch (ArithmeticException e) {
			System.err.println("Exception: " + e);
			System.out.println("\nDigite números inteiros positivos maiores que zero!");
			
		} finally {
			System.out.println("\nSempre serei executado ao final");
		}

	}

}
