package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.ClasseControle;
import br.edu.ifpi.biolab.entidade.Classe;

public class ClasseVisao {

	private ClasseControle classeControle;

	public ClasseVisao() {
		classeControle = new ClasseControle();
	}

	public static void main(String[] args) throws SQLException {
		ClasseVisao visao = new ClasseVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Classe> classes = visao.buscaTodos();
				String classesTela = "";
				for (Classe classe : classes) {
					classesTela = classesTela + classe.getId() + "-" + classe.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, classesTela);
				break;
			case 2:
				String nomeClasse = JOptionPane.showInputDialog("Digite o nome da Classe.");
				Classe c = new Classe(nomeClasse);
				visao.adiciona(c);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Classe> buscaTodos() throws SQLException {
		return classeControle.buscaTodos();
	}

	public void adiciona(Classe classe) throws SQLException {
		classeControle.adiciona(classe);
	}
}
