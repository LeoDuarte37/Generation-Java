 package poo2;

public class Celular extends Telefone {
	
	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		
		switch(codigoToque) {
		case 1:
			System.out.println("\nTititi tututu");
			break;
			
		case 2:
			System.out.println("\nPowwwwwwwwwwww");
			break;
			
		default:
			System.out.println("\nHello Motor");
		}
	}
	
	@Override
	public void discar(String numero) {
		System.out.println("\nDiscando: " + numero);
	}
}
