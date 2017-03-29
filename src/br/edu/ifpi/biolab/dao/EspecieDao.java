package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Especie;

public class EspecieDao extends Dao {

	public void adiciona(Especie especie) throws SQLException {

		String sql = "INSERT INTO Especie (nomeCientifico ,id) VALUES + ('?,?,?')";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, especie.getNomeCientifico());
		stmt.setInt(2, especie.getId());
		stmt.setLong(3, especie.getGenero().getid());
		stmt.execute();
		stmt.close();
		System.out.println("Especie salvo com sucesso!");

	}

	public List<Especie> buscaTodos() throws SQLException {
		List<Especie> especies = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select *from especie");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Especie especie = new Especie(null);
			especie.setId(rs.getInt("Id"));
			especie.setNomeCientifico(rs.getString("nome cientifico"));
		}

		rs.close();
		stmt.close();
		return especies;

	}

	public Especie buscaPorID() {
		return null;

	}

}
