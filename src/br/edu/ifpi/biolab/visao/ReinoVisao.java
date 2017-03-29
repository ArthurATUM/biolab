package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.ReinoControle;
import br.edu.ifpi.biolab.entidade.Reino;

public class ReinoVisao {

	private ReinoControle reinoControle;

	public ReinoVisao() {
		reinoControle = new ReinoControle();
	}

	public static void main(String[] args) throws SQLException {
		ReinoVisao visao = new ReinoVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Reino> reinos = visao.buscaTodos();
				String reinosTela = "";
				for (Reino reino : reinos) {
					reinosTela = reinosTela + reino.getId() + "-" + reino.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, reinosTela);
				break;
			case 2:
				String nomeReino = JOptionPane.showInputDialog("Digite o nome do Reino.");
				Reino r = new Reino(nomeReino);
				visao.adiciona(r);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Reino> buscaTodos() throws SQLException {
		return reinoControle.buscaTodos();
	}

	public void adiciona(Reino reino) throws SQLException {
		reinoControle.adiciona(reino);
	}
}
