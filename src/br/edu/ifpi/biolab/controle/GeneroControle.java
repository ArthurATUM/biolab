package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.GeneroDao;
import br.edu.ifpi.biolab.entidade.Genero;

public class GeneroControle {

	private GeneroDao generoDao;

	public GeneroControle() {
		generoDao = new GeneroDao();
	}

	public void adiciona(Genero genero) throws SQLException {
		generoDao.adiciona(genero);
	}

	public List<Genero> buscaTodos() throws SQLException {
		List<Genero> generos = generoDao.buscaTodos();
		return generos;

	}
	
	public void fechaConexao(){
		generoDao.fechaConexao();
	}

}