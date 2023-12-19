package poo2;

public class Fixo extends Telefone {
	
	public Fixo() {
		super("Telefone Fixo");
	}

	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTriiimmmm Triiimmmm");
		}
	}

	public void discar(String numero) {
		System.out.println("\nDiscando: " + numero);
	}
}
