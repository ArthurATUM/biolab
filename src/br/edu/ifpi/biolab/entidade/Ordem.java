package br.edu.ifpi.biolab.entidade;

public class Ordem {
	
	private String nome;
	private int id;
	private Familia familia;
	
	public Ordem (String nomeOrdem){
		
	}
	
	public Ordem (String nome, int id) {
		this.nome = nome;
		this.id = id;
		
	} 
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	
	

}

	
	
	
	
	
	
	
	
