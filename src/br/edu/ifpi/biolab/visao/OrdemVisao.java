package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.OrdemControle;
import br.edu.ifpi.biolab.entidade.Ordem;

public class OrdemVisao {

	private OrdemControle ordemControle;

	public OrdemVisao() {
		ordemControle = new OrdemControle();
	}

	public static void main(String[] args) throws SQLException {
		OrdemVisao visao = new OrdemVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Ordem> ordems = visao.buscaTodos();
				String ordemsTela = "";
				for (Ordem ordem : ordems) {
					ordemsTela = ordemsTela + ordem.getId() + "-" + ordem.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, ordemsTela);
				break;
			case 2:
				String nomeOrdem = JOptionPane.showInputDialog("Digite o nome da ordem.");
				Ordem o = new Ordem(nomeOrdem);
				visao.adiciona(o);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Ordem> buscaTodos() throws SQLException {
		return ordemControle.buscaTodos();
	}

	public void adiciona(Ordem ordem) throws SQLException {
		ordemControle.adiciona(ordem);
	}
}
