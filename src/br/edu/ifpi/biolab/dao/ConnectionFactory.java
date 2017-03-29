package br.edu.ifpi.biolab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConexao() throws SQLException {
		try {
			return DriverManager.getConnection("jdbc:mysql://10.0.30.81/arthur_soraya_biolab", "aluno", "aluno");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}





//return DriverManager.getConnection("jdbc:mysql://192.168.3.239/amanda_jaiza_biolab", "aluno", "aluno");
