package poo;

public class Retangulo extends BaseFigura implements Figuras {
	
	Retangulo(double lado1, double lado2, String nome) {
		super(lado1, lado2, nome);
		nomeClasse = "Retângulo";
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
	}
	
	// math.pow retorna a base elevada ao expoente (lado1 ao quadrado).
	// Math.sqrt retorna a raiz quadrada de um número.
}
