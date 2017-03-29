package br.edu.ifpi.biolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.biolab.entidade.Classe;

public class ClasseDao extends Dao {

	public void adiciona(Classe classe) throws SQLException {

		String sql = "INSERT INTO Classe (nome) VALUES (?)";

		PreparedStatement stmt = super.getConexao().prepareStatement(sql);

		stmt.setString(1, classe.getNome());

		stmt.execute();
		stmt.close();
		System.out.println("Classe salvo com sucesso!");

	}

	public List<Classe> buscaTodos() throws SQLException {
		List<Classe> Classes = new ArrayList<>();
		PreparedStatement stmt = super.getConexao().prepareStatement("Select * from Classe");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Classe classe = new Classe(null);
			classe.setId(rs.getInt("Id"));
			classe.setNome(rs.getString("nome"));
			Classes.add(classe);
		}

		rs.close();
		stmt.close();
		return Classes;

	}

}

