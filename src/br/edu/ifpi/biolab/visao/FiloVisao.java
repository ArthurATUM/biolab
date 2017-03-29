package br.edu.ifpi.biolab.visao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.biolab.controle.FiloControle;
import br.edu.ifpi.biolab.entidade.Filo;

public class FiloVisao {

	private FiloControle filoControle;

	public FiloVisao() {
		filoControle = new FiloControle();
	}

	public static void main(String[] args) throws SQLException {
		FiloVisao visao = new FiloVisao();

		int opcaoEscolhida = 1;
		while (opcaoEscolhida != 0) {
			String menu = "1- consultar\n2- adicionar\n0- Sair";

			String valorDigitado = JOptionPane.showInputDialog(menu);
			opcaoEscolhida = Integer.parseInt(valorDigitado);

			switch (opcaoEscolhida) {
			case 1:
				List<Filo> filos = visao.buscaTodos();
				String filosTela = "";
				for (Filo filo : filos) {
					filosTela = filosTela + "-" + filo.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, filosTela);
				break;
			case 2:
				String nomeFilo = JOptionPane.showInputDialog("Digite o nome do Filo.");
				Filo fi = new Filo(nomeFilo);
				visao.adiciona(fi);
				JOptionPane.showConfirmDialog(null, "adicionado com sucesso");
				
				break;
			}
		}
	}

	public List<Filo> buscaTodos() throws SQLException {
		return filoControle.buscaTodos();
	}

	public void adiciona(Filo filo) throws SQLException {
		filoControle.adiciona(filo);
	}
}
