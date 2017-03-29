package br.edu.ifpi.biolab.entidade;

public class Genero {

	private int id;
	private String nome;
	
	public Genero (String nomeGenero){
		
	}

	public Genero(int id, String nome) {
		this.nome = nome;
		this.id = id;

	}

	public int getid() {
		return id;
	}

	public String getNome() {

		return nome;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}