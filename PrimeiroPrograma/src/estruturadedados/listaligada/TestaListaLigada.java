package estruturadedados.listaligada;

import javax.swing.JOptionPane;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		String relatorioFinal = lista.toString();
		lista.adicionaNoComeco("Jupiter");
		relatorioFinal += "\n" + lista.toString();
		lista.adicionaNoComeco("Marte");
		relatorioFinal += "\n" + lista.toString();
		lista.adicionaNoComeco("Terra");
		relatorioFinal += "\n" + lista.toString();
		lista.adiciona("Netuno");
		relatorioFinal += "\n" + lista.toString();
		lista.adiciona(2, "Venus");
		relatorioFinal += "\n" + lista.toString();
		relatorioFinal += "\n" + lista.pega(2);
		relatorioFinal += "\nTamanho da lista: " + lista.tamanho();
		lista.removeDoComeco();
		relatorioFinal += "\n" + lista.toString();
		relatorioFinal += "\nTamanho da lista: " + lista.tamanho();
		JOptionPane.showMessageDialog(null, relatorioFinal);

	}

}