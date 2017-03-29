package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Reino;

public class ReinoDao extends Dao {

	public void adiciona(Reino reino) throws SQLException {

		String sql = "INSERT INTO Reino (nome) VALUES (?)";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, reino.getNome());

		stmt.execute();
		stmt.close();
		System.out.println("Reino salvo com sucesso!");

	}

	public List<Reino> buscaTodos() throws SQLException {
		List<Reino> reinos = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select * from Reino");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Reino reino = new Reino();
			reino.setId(rs.getInt("Id"));
			reino.setNome(rs.getString("nome"));
			reinos.add(reino);
		}

		rs.close();
		stmt.close();
		return reinos;

	}

}
