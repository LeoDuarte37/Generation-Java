package poo2;

public class Publico extends Telefone {
	
	public Publico() {
		super("Telefone público");
	}

	@Override
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTraaaammmm Traaaammmm");
		}
	}

	@Override
	public void discar(String numero) {
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("\nTelefone público (orelhão) não disca para celular...");
		} else {
			System.out.println("\nDiscando: " + numero);
		}
	}
}
