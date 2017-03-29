package br.edu.ifpi.biolab.entidade;

public class Filo {
	
	private int id;
	private String nome;
	private Classe classe;
	
	public Filo (String nomeFilo){
		
	}


	public Filo(int id, String nome) {
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

	
	public Classe getClasse() {
		return classe;
	}


	public void setClasse(Classe classe) {
		this.classe = classe;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
