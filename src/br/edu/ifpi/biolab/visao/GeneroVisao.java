package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.GeneroControle;
import br.edu.ifpi.biolab.entidade.Genero;

public class GeneroVisao {

	private GeneroControle generoControle;

	public GeneroVisao() {
		generoControle = new GeneroControle();
	}

	public static void main(String[] args) throws SQLException {
		GeneroVisao visao = new GeneroVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Genero> generos = visao.buscaTodos();
				String generosTela = "";
				for (Genero genero : generos) {
					generosTela = generosTela + "-" + genero.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, generosTela);
				break;
			case 2:
				String nomeGenero = JOptionPane.showInputDialog("Digite o nome do Genero.");
				Genero g = new Genero(nomeGenero);
				visao.adiciona(g);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Genero> buscaTodos() throws SQLException {
		return generoControle.buscaTodos();
	}

	public void adiciona(Genero genero) throws SQLException {
		generoControle.adiciona(genero);
	}
}
