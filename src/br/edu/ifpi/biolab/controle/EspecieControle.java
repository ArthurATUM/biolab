package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.EspecieDao;
import br.edu.ifpi.biolab.entidade.Especie;

public class EspecieControle {

	private EspecieDao especieDao;

	public EspecieControle() {
		especieDao = new EspecieDao();
	}

	public void adiciona(Especie especie) throws SQLException {
		especieDao.adiciona(especie);
	}

	public List<Especie> buscaTodos() throws SQLException {
		List<Especie> especies = especieDao.buscaTodos();
		return especies;

	}
	
	public void fechaConexao(){
		especieDao.fechaConexao();
	}

}