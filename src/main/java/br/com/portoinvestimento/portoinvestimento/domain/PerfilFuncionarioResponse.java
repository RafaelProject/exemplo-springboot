package br.com.portoinvestimento.portoinvestimento.domain;

public class PerfilFuncionarioResponse {
	
	private int id;
	private String nome;
	private String trabalho;
	private double salario;
	private String dataInicio;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
}
