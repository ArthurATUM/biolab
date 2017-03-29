package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.EspecieControle;
import br.edu.ifpi.biolab.entidade.Especie;

public class EspecieVisao {

	private EspecieControle especieControle;

	public EspecieVisao() {
		especieControle = new EspecieControle();
	}

	public static void main(String[] args) throws SQLException {
		EspecieVisao visao = new EspecieVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Especie> especies = visao.buscaTodos();
				String especiesTela = "";
				for (Especie especie : especies) {
					especiesTela = especiesTela + especie.getId() + "-" + especie.getNomeCientifico() + "\n";
				}
				JOptionPane.showMessageDialog(null, especiesTela);
				break;
			case 2:
				String nomeEspecie = JOptionPane.showInputDialog("Digite o nome da Especie.");
				Especie e = new Especie(nomeEspecie);
				visao.adiciona(e);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Especie> buscaTodos() throws SQLException {
		return especieControle.buscaTodos();
	}

	public void adiciona(Especie especie) throws SQLException {
		especieControle.adiciona(especie);
	}
}
