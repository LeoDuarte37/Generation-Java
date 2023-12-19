package poo;

public class PessoaFisica extends Cliente {
	// Atributos
	private String cpf, rg;
	
	// Construtor
	public PessoaFisica(String nome, int idade, String profissao, float renda, String email, String cpf, String rg) {
		super(nome, idade, profissao, renda, email);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	// Métodos
	public void visualizar() {
		super.visualizar();
		System.out.println("\nCPF: " + this.cpf);
		System.out.println("\nRG: " + this.rg);
	}

	// Getters and Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
}
