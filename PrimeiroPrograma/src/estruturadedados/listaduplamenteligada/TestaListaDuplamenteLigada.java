package estruturadedados.listaduplamenteligada;

import javax.swing.JOptionPane;


public class TestaListaDuplamenteLigada {

	public static void main(String[] args) {
		
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
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
		lista.removeDoFim();
		relatorioFinal += "\n" + lista.toString();
		relatorioFinal += "\nTamanho da lista: " + lista.tamanho();
		lista.remove(1);
		relatorioFinal += "\n" + lista.toString();
		relatorioFinal += "\nLista contém Terra? " + lista.contem("Terra");
		relatorioFinal += "\nLista contém Plutão? " + lista.contem("Plutão");
		JOptionPane.showMessageDialog(null, relatorioFinal);

	}

}