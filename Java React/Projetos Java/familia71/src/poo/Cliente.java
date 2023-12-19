package poo;

public class Cliente {
	// Atributos
	private String nome;
	private int idade;
	private String profissao;
	private float renda;
	private String email;
	
	// Construtor
	public Cliente(String nome, int idade, String profissao, float renda, String email) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.renda = renda;
		this.email = email;
	}
	
	// Métodos
	public void visualizar() {
		System.out.println("\n*********************************");
		System.out.println("\n\tDados do cliente\n");
		System.out.println("*********************************");
		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nProfissão: " + profissao);
		System.out.println("\nRenda: " + renda);
		System.out.println("\nEmail: " + email);
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
