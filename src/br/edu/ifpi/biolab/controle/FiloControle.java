package br.edu.ifpi.biolab.controle;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifpi.biolab.dao.FiloDao;
import br.edu.ifpi.biolab.entidade.Filo;

public class FiloControle {

	private FiloDao filoDao;

	public FiloControle() {
		filoDao = new FiloDao();
	}

	public void adiciona(Filo filo) throws SQLException {
		filoDao.adiciona(filo);
	}

	public List<Filo> buscaTodos() throws SQLException {
		List<Filo> filos = filoDao.buscaTodos();
		return filos;

	}
	
	public void fechaConexao(){
		filoDao.fechaConexao();
	}

}