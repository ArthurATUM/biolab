package br.edu.ifpi.biolab.entidade;

public class Especie {
	
	private int id;
	private String nomeCientifico;
	private Genero genero;
	
	public Especie(String nomeEspecie) {
	
	}
	

	public Especie(int id, String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	
}
