package poo;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		Automovel carro1 = new Automovel("Carol Ferreira", "Ferrari", "NTO2022", 2011);
		
		carro1.mostrarInfo();
		
		System.out.println("\n\t---------------Transferência do automóvel---------------");
		
		carro1.setNomeProprietario("Leo Duarte");
		carro1.mostrarInfo();
		
		carro1.setPlaca("NTO2T22");
		
		carro1.mostrarInfo();
	}

}
