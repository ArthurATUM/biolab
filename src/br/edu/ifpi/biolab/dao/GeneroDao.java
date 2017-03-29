package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Genero;

public class GeneroDao extends Dao {

	public void adiciona(Genero genero) throws SQLException {

		String sql = "INSERT INTO Genero (nome) VALUES (?)";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, genero.getNome());

		stmt.execute();
		stmt.close();
		System.out.println("Genero salvo com sucesso!");

	}

	public List<Genero> buscaTodos() throws SQLException {
		List<Genero> generos = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select * from Genero");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Genero genero = new Genero(null);
			genero.setId(rs.getInt("Id"));
			genero.setNome(rs.getString("nome"));
			generos.add(genero);
		}

		rs.close();
		stmt.close();
		return generos;

	}

}
