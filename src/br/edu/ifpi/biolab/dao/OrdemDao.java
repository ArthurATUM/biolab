package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Ordem;

public class OrdemDao extends Dao {

	public void adiciona(Ordem ordem) throws SQLException {

		String sql = "INSERT INTO Ordem (nome) VALUES (?)";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, ordem.getNome());

		stmt.execute();
		stmt.close();
		System.out.println("Ordem salvo com sucesso!");

	}

	public List<Ordem> buscaTodos() throws SQLException {
		List<Ordem> ordens = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select * from Ordem");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Ordem ordem = new Ordem(null);
			ordem.setId(rs.getInt("Id"));
			ordem.setNome(rs.getString("nome"));
			ordens.add(ordem);
		}

		rs.close();
		stmt.close();
		return ordens;

	}

}
