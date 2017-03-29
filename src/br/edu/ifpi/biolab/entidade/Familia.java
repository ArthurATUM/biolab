package br.edu.ifpi.biolab.entidade;

public class Familia {

	private String nome;
	private int id;
	private Genero genero;
	
	public Familia (String nomeFamilia){
		
	}

	public Familia(int id, String nome) {
		this.nome = nome;
		this.id= id;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;

	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}