package poo3;

public class Quadrado extends BaseFigura implements Figuras{
	
	Quadrado(double lado, String nome) {
		super(lado, lado, nome);
		nomeClasse = "Quadrado";
	}

	@Override
	public double getDiagonal() {
		// Tem na interface
		return Math.sqrt(2) * lado1; // Calcula a diagonal do quadrado
	}
}
