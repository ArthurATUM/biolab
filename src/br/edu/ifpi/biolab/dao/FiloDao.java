package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Filo;

public class FiloDao extends Dao {

	public void adiciona(Filo filo) throws SQLException {

		String sql = "INSERT INTO filo (nome) VALUES (?)";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, filo.getNome());

		stmt.execute();
		stmt.close();
		System.out.println("filo salvo com sucesso!");

	}

	public List<Filo> buscaTodos() throws SQLException {
		List<Filo> filos = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select * from Filo");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Filo filo = new Filo(null);
			filo.setId(rs.getInt("Id"));
			filo.setNome(rs.getString("nome"));
			filos.add(filo);
		}

		rs.close();
		stmt.close();
		return filos;

	}

}
