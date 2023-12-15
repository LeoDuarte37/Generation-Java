package poo;

import java.text.NumberFormat;

public class Empregado {
	// Atributos
	private String nome;
	private double salario;
	
	// Construtor
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	// Métodos
	public void aumentarSalario(double porcentual) {
		salario *= 1 + porcentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		String formatoMoeda = nf.format(salario);	// nf.format retorna em String
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + "\t\tSalário: " + this.formatarMoeda());
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
