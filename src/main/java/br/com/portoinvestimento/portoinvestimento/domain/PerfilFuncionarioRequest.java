package br.com.portoinvestimento.portoinvestimento.domain;

public class PerfilFuncionarioRequest {
	
	private String nome;
	private String trabalho;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
