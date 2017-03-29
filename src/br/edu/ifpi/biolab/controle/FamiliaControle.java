package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.FamiliaDao;
import br.edu.ifpi.biolab.entidade.Familia;

public class FamiliaControle {

	private FamiliaDao familiaDao;

	public FamiliaControle() {
		familiaDao = new FamiliaDao();
	}

	public void adiciona(Familia familia) throws SQLException {
		familiaDao.adiciona(familia);
	}

	public List<Familia> buscaTodos() throws SQLException {
		List<Familia> familias = familiaDao.buscaTodos();
		return familias;

	}
	
	public void fechaConexao(){
		familiaDao.fechaConexao();
	}

}