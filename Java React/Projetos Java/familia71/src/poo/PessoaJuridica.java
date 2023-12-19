package poo;

public class PessoaJuridica extends Cliente{
	// Atributos
	private String cnpj;

	// Construtor
	public PessoaJuridica(String nome, int idade, String profissao, float renda, String email, String cnpj) {
		super(nome, idade, profissao, renda, email);
		this.cnpj = cnpj;
	}

	// Métodos
	public void visualizar() {
		super.visualizar();
		System.out.println("\nCNPJ: " + cnpj);
	}
	
	// Getters and Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
