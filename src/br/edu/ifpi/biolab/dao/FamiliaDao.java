package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Familia;

public class FamiliaDao extends Dao {

	public void adiciona(Familia familia) throws SQLException {

		String sql = "INSERT INTO Familia (nome) VALUES (?)";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, familia.getNome());

		stmt.execute();
		stmt.close();
		System.out.println("Familia salvo com sucesso!");

	}

	public List<Familia> buscaTodos() throws SQLException {
		List<Familia> familias = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select * from Familia");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Familia familia = new Familia(null);
			familia.setId(rs.getInt("Id"));
			familia.setNome(rs.getString("nome"));
			familias.add(familia);
		}

		rs.close();
		stmt.close();
		return familias;

	}

}
