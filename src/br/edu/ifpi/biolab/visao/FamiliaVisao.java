package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.FamiliaControle;
import br.edu.ifpi.biolab.entidade.Familia;

public class FamiliaVisao {

	private FamiliaControle familiaControle;

	public FamiliaVisao() {
		familiaControle = new FamiliaControle();
	}

	public static void main(String[] args) throws SQLException {
		FamiliaVisao visao = new FamiliaVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Familia> familias = visao.buscaTodos();
				String familiasTela = "";
				for (Familia familia : familias) {
					familiasTela = familiasTela + familia.getId() + "-" + familia.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, familiasTela);
				break;
			case 2:
				String nomeFamilia = JOptionPane.showInputDialog("Digite o nome da Familia.");
				Familia f = new Familia(nomeFamilia);
				visao.adiciona(f);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Familia> buscaTodos() throws SQLException {
		return familiaControle.buscaTodos();
	}

	public void adiciona(Familia familia) throws SQLException {
		familiaControle.adiciona(familia);
	}
}
