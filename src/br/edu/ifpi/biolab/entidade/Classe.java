package br.edu.ifpi.biolab.entidade;

public class Classe {
	
	private int id;
	private String nome;
	private Ordem ordem;

	public Classe (String nomeClasse){
		
	}

	public Classe(String nome, int id) {
		this.nome = nome;
		this.id = id;
	
		
	}
	public int getid() {

		return id;
	}


	public String getNome() {

		return nome;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
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
