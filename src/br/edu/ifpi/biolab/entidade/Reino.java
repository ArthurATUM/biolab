package br.edu.ifpi.biolab.entidade;

public class Reino {

	private int id;
	private String nome;
	
	
	public Reino() {
	
	}

	public Reino(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}