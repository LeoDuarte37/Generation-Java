package poo;

public class TesteCliente {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Leo", 19, "Desenvolvedor", 1800f, "leoDev@gmail.com");
		
		// Testes dos objetos usando as subclasses PessoaFisica e PessoaJuridica
		PessoaFisica pessoaFisica1 = new PessoaFisica("Carol", 18, "Biomédica", 100000f, 
									"carol@minhaNamorada.com", "123.456.789-00", "12.345.678-9");
		
		PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Duarte Leonardo", 26, "Java Senior", 100000f,
															"DuarteLeo@gmail.com", "12.345.678/0001-00");
		
		cliente1.visualizar();
		
		pessoaFisica1.visualizar();
		
		pessoaJuridica1.visualizar();

	}

}
